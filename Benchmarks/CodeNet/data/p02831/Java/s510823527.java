import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int A,B;
      A=sc.nextInt();
      B=sc.nextInt();
      System.out.println(A);
      sc.close();
      int ans=solve(A,B);
      System.out.println(ans);
    }
  
  static int solve(int a,int b){
    int result=1;
    int i;
    for(i=2;i<=100000||a==1||b==1;i++){
      if(a%i==0&&b%i==0){
        result=result*i;
        a=a/i;
        b=b/i;
        i=2;
      }
    }
    
    return result;
  }
 
}