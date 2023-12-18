import java.util.*;
class Main{
  public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
	int N = stdIn.nextInt();
    int D = stdIn.nextInt();
    int a =D*2+1;
    int ans=N/a;
    if(N%a!=0){
      ans+=1;
    }
    System.out.println(ans);
  }
}