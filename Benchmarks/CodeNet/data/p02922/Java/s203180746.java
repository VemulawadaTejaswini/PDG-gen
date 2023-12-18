import java.util.*;
class Main{
  public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
	int A = stdIn.nextInt();
    int B = stdIn.nextInt();
    int ans=B/A;
    if(A>B){
      ans=1;
    }
    if(A<B&&B%A!=0){
      ans+=1;
    }
    System.out.println(ans);
  }
}