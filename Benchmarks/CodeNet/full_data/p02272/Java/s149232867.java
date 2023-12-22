import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    
    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      int n = Integer.parseInt(br.readLine());
      String[] line = br.readLine().split(" ");
      int i=0;
      int[] arrayS = new int[n];
      for (String val : line) {
        arrayS[i++] = Integer.parseInt(val);
      }

      int cnt = mergeSort(arrayS, 0, n);

      dispIntArray(arrayS);
      System.out.println(cnt);
    }
  }

  private static int mergeSort(int[] a, int left, int right) {
    int cnt =0;

    if(left+1 < right){
      int mid = (left + right) / 2;
      cnt += mergeSort(a, left, mid);
      cnt += mergeSort(a, mid, right);
      cnt += merge(a, left, mid, right);
    }

    return cnt;
  }

  private static int merge(int a[], int left, int mid, int right) {
    int cnt = 0;
    int n1 = mid - left;
    int n2 = right - mid;
    int[] arrayL = new int[n1+1];
    int[] arrayR = new int[n2+1];
    
    for(int i=0; i<n1; i++)
      arrayL[i] = a[left+i];
    arrayL[n1] = Integer.MAX_VALUE;

    for(int i=0; i<n2; i++)
      arrayR[i] = a[mid+i];
    arrayR[n2] = Integer.MAX_VALUE;

    for(int i=0,j=0,k=left; k<right; k++) {
      if(arrayL[i] <= arrayR[j])
        a[k] = arrayL[i++];
      else
        a[k] = arrayR[j++];
      cnt++;
    }

    return cnt;
  }

  public static void dispIntArray(int a[]) {
    StringBuilder s = new StringBuilder();

    for (int i : a) { s.append(i).append(" "); }
    s.setLength(s.length()-1);

    System.out.println(s);
  }
}
