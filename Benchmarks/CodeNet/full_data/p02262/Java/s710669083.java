import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    
    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      int n = Integer.parseInt(br.readLine());
      int[] seq = new int[n];
      for(int i=0; i!=n; i++)
        seq[i] = Integer.parseInt(br.readLine());

      int cnt = shellSort(seq, n);
      System.out.println(cnt);
      StringBuilder str = new StringBuilder(n*2);
      for (int i : seq)
        str.append(i).append("\n");
      str.setLength(str.length()-1);
      System.out.println(str);
    }
  }

  public static int shellSort(int a[], int n) {
    int cnt=0;
    int m = 0;
    int[] aG = new int[n/2];
    for (int i=0,d=1; d < n; i++,d=(d*3+1)) {
      aG[i] = d; m++;
    }
    System.out.println(m);
    StringBuilder str = new StringBuilder(m*2);

    for(int i=(m-1); i!=-1; i--){
      cnt += insertionSort(a, n,aG[i]);
      str.append(aG[i]).append(" ");
    }
    str.setLength(str.length()-1);
    System.out.println(str);

    return cnt;
  }
  
  public static int insertionSort(int a[], int max, int g) {
    int cnt=0;

    for (int i=g,j=0,v=0; i < max; i++) {
      for( j=(i-g), v=a[i]; j>=0 && a[j]>v; j=j-g ) {
        a[j+g] = a[j];
        cnt++;
      }
      a[j+g] = v;
    }

    return cnt;
  }
}
