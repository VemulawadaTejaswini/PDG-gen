import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int A=sc.nextInt();
    int B=sc.nextInt();
    int N=0;
    
    for(int i=1;i<=B;i++){
      N=N+A;
      if(N%B==0){
        break;
      }
    }
    System.out.println(N);
  }
}