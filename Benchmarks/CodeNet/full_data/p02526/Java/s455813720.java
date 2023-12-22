import java.util.Scanner;

  class Main{
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int n = stdIn.nextInt();
    int[] a = new int[n];
     for (int i = 0; i < a.length; i++) {
        a[i] = stdIn.nextInt();
     }
    Scanner std =new Scanner(System.in);
    final int N = 8;
    int[] b = new int[N];
      for(int j=0;j < b.length;j++){
        b[j] = std.nextInt();
      }

   int count =0;
 for(int k=0;k<n;k++){
   
  for(int p=0;p<N;p++){
  if(a[k]==b[p]) count++;
   }
  }
System.out.println(count);
 }
}