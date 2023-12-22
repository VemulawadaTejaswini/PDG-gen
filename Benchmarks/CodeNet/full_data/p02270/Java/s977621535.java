import java.io.*;
import java.util.*;
class Main{
  public static void main(String args[])throws Exception{
    Scanner sc = new Scanner(System.in);
    // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // String s[]= br.readLine().split("\\s+");
    int sum=0;
    // int n = Integer.parseInt(s[0]);
    // int k = Integer.parseInt(s[1]) ;
    int n = sc.nextInt();
    int k = sc.nextInt();
    for(int i =0; i<n; i++){
      sum += sc.nextInt();
    }
    int p = sum%k;
    int q = (sum-p)/k+p;
    System.out.println(q);
  }
}
