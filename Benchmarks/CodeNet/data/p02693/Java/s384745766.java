import java.util.Scanner;
class Main{
  public static void main (String[] args){
    Scanner stdIn = new Scanner(System.in);
    
    int K = stdIn.nextInt();
    int a = stdIn.nextInt();
    int b = stdIn.nextInt();
    
    int t = 0;
    for(int i = a;i <= b;i++){
		 if(i % K == 0)
           t++;
    }
    if(t > 0)
      System.out.println("OK");
    else
      System.out.println("NG");
  }
}
