import java.util.Scanner;

  class Main{
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int n = stdIn.nextInt();
    int[] a = new int[n];
     for (int i = 0; i < n; i++) {
        a[i] = stdIn.nextInt();
     }
    Scanner std =new Scanner(System.in);
    int N = std.nextInt();
    int[] b = new int[N];
      for(int j=0;j < N;j++){
        b[j] = std.nextInt();
      }
for(int k=0;k<n;k++){
  for(int p=0;p<N;p++){
  if(a[k]==b[p])return a[k];break;
   }
  }
System.out.println();
 }
}