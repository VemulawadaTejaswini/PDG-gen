import java.util.*;

public class Main {
  public static void main(String[] args) {
    int N;
    int[] H;
    try(Scanner sc = new Scanner(System.in)) {
      N = sc.nextInt();
      H = new int[N];
      for(int i = 0; i < N; i++) {
        H[i] = sc.nextInt();
      }
    }
    DataSet indata = new DataSet(N, H);
    Result answer = canBuildStair(indata, Integer.MAX_VALUE);
    System.out.println(answer.isSuccess() ? "Yes": "No");
  }
  
  private static Result canBuildStair(DataSet dataSet, int max) {
    int n = dataSet.size();
    if ( n == 0 ) {
      return new Result(dataSet, true);
    }
    int lastValue = dataSet.lastValue();
    int shift = 0;
    if ( lastValue > max ) {
      shift = -1;
    }
    if ( shift < 0 && lastValue - 1 > max ) {
      return new Result(dataSet, false);
    }
    DataSet[] children = dataSet.children();
    DataSet left = children[0];
    DataSet right = children[1];
    
    Result leftResult = null;
    Result rightResult = null;
    if ( right.isEmpty() ) {
      rightResult = new Result(right, true);
      leftResult = canBuildStair(left, lastValue + shift);
    }
    else {
      rightResult = canBuildStair(right, lastValue + shift);
      if ( rightResult.isSuccess() == false ) {
        DataSet resultData = DataSet.concat(left, rightResult.dataSet(), lastValue + shift);
        return new Result(resultData, false);
      }
      leftResult = canBuildStair(left, rightResult.firstValue());
    }
    
    DataSet resultData = DataSet.concat(leftResult.dataSet(), rightResult.dataSet(), lastValue + shift);
    return new Result(resultData, leftResult.isSuccess());
  }
  
  private static class Result {
    private final DataSet dataSet;
    private final boolean bResult;

    public Result(DataSet dataSet, boolean bResult) {
      this.dataSet = dataSet;
      this.bResult = bResult;
    }

    public boolean isSuccess() {
      return bResult;
    }

    public DataSet dataSet() {
      return dataSet.clone();
    }

    public int firstValue() {
      return dataSet.firstValue();
    }
  }

  private static class DataSet {
    private final int n;
    private final int[] h;

    public DataSet(int n, int[] h) {
      this.n = n;
      this.h = h;
    }

    public int size() {
      return n;
    }
    
    public boolean isEmpty() {
      return n < 1;
    }

    public int firstValue() {
      return h[0];
    }

    public int lastValue() {
      return h[n-1];
    }

    public DataSet clone() {
      return new DataSet(n, h());
    }

    private int[] h() {
      int[] hCopied = new int[n];
      for(int i = 0; i < n; i++) {
        hCopied[i] = h[i];
      }
      return hCopied;
    }

    public static DataSet concat(DataSet d1, DataSet d2, int lastValue) {
      int n1 = d1.size();
      int n2 = d2.size();
      int nn = n1 + n2 + 1;
      int[] hh = new int[nn];
      int[] h1 = d1.h();
      for ( int i = 0; i < n1; i++ ) {
        hh[i] = h1[i];
      }
      int[] h2 = d2.h();
      for ( int i = 0; i < n2; i++ ) {
        hh[n1+i] = h2[i];
      }
      hh[nn-1] = lastValue;
      return new DataSet(nn, hh);
    }

    public DataSet[] children() {
      int n0 = (int)(Math.floor((n-1)/2));
      int n1 = (n-1) - n0;
      int[] h0 = new int[n0];
      for(int i = 0; i < n0; i++) {
        h0[i] = h[i];
      }
      int[] h1 = new int[n1];
      for(int i = 0; i < n1; i++) {
        h1[i] = h[n0 + i];
      }
      DataSet[] children = new DataSet[2];
      children[0] = new DataSet(n0, h0);
      children[1] = new DataSet(n1, h1);
      return children;
    }
  }
}