import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sr = new Scanner(System.in);
    int N = sr.nextInt();
    long A[] = new long[N];
    long ans = 1;
    for(int i=0;i<N;i++)
      A[i]= sr.nextLong();
    for(long j:A){ans *= j;}
	String hoge = "1000000000000000000";
	long num = Long.parseLong(hoge);
    if(ans>num)
      System.out.println("-1");
    else 
      System.out.println(ans);
  
  }

}