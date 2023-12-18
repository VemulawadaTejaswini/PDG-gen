import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
    int n = Integer.parseInt(br.readLine());
    
    int[] a = new int[n];
    int[] b = new int[n];
    String[] data = br.readLine().split(" ");
    int temp;
    for (int i=0; i<n; i++){
      temp = Integer.parseInt(data[i])-1;
      a[temp]++;
      b[i] = temp;
    }
    int sum = 0;
    for (int i=0; i<n; i++){
      sum += (a[i]*(a[i]-1))/2;
    }
    int result;
    for (int i=0; i<n; i++){
      result = sum - (a[b[i]]*(a[b[i]]-1))/2 + ((a[b[i]]-1)*(a[b[i]]-2))/2;
      System.out.println(result);
    }
  }
}
