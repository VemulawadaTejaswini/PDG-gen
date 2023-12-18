import java.util.*;


public class Main {
  private static boolean IS_DEBUG = false;
  
  public static void main(String[] args) {
    int N;
    int[] A;
    int[] B;
    try(Scanner sc = new Scanner(System.in)) {
      N = sc.nextInt();
      A = new int[N+1];
      B = new int[N];
      for(int k = 0; k < N+1; k++) {
        A[k] = sc.nextInt();
      }
      for(int k = 0; k < N; k++ ) {
        B[k] = sc.nextInt();
      }
    }
    CalcState cs = new CalcState(0);
    CalcState csResult = getResult(A, B, cs);
    System.out.println(csResult.getValue());
    debugResult(A, B, csResult);
  }
  
  private static CalcState getResult(int[] a, int[] b, CalcState cs) {
    int n = b.length;
    if ( a.length != n + 1 ) {
      throw new IllegalStateException("#a = " + a.length + ", #b = " + n);
    }
    if ( n == 0 ) {
      CalcState csResult = new CalcState(cs);
      return csResult;
    }
    int b0 = b[0];
    int b0min = (int)(Math.min(b0, a[0]));
    if ( n == 1 ) {
      CalcState csResult = new CalcState(cs);
      int b01 = (int)Math.min(b0 - b0min, a[1]);
      csResult.append(b0min, b01);
      return csResult;
    }
    CalcState resultState = null;
    int result = -1;
    for ( int b00 = 0; b00 <= b0min; b00++ ) {
	    int[] aNext = new int[n];
    	int[] bNext = new int[n-1];
        int b01 = (int)(Math.min(b0 - b00, a[1]));
        aNext[0] = a[1] - b01;
        bNext[0] = b[1];
        for(int k = 2; k < n; k++) {
          aNext[k-1] = a[k];
          bNext[k-1] = b[k];
        }
        aNext[n-1] = a[n];
        CalcState cs0 = new CalcState(cs);
        cs0.append(b00, b01);
        CalcState candidateState = getResult(aNext, bNext, cs0);
        debugResult(aNext, bNext, candidateState);
        int candidate = candidateState.getValue();
      	if ( result < candidate ) {
          result = candidate;
          resultState = candidateState;
        }
    }
    return resultState;
  }
  
  private static class CalcState {
    private int value;
    private final StringBuffer sb;
    
    public CalcState(int value) {
      this.value = value;
      this.sb = new StringBuffer();
    }
    
    public CalcState(CalcState cs0) {
      this.value = cs0.value;
      this.sb = new StringBuffer(cs0.getString());
    }
    
    public int getValue() {
      return value;
    }
    
    public String getString() {
      return sb.toString();
    }
    
    public CalcState append(int v1, int v2) {
      this.value += v1 + v2;
      sb.append("(").append(v1).append(",").append(v2).append(")");
      return this;
    }
  }
  
  private static void debugResult(int[] a, int[] b, CalcState cs) {
    if ( IS_DEBUG == false ) {
      return;
    }
    int n = b.length;
    System.out.println("#D: " + n);
    System.out.print("#D: ");
    for(int k = 0; k < a.length; k++) {
		System.out.print(a[k] + " ");
    }
    System.out.println("");
    System.out.print("#D: ");
    for(int k = 0; k < b.length; k++) {
      	System.out.print(b[k] + " ");
    }
    System.out.println("");
    System.out.println("#D: " + cs.getString());
  }
}