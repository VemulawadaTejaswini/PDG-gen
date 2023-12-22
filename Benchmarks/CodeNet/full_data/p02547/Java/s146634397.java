import java.util.*;
public class Main{
  public static void main(String[] args)throws Exception{
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    for(N=3;N<=100;N++){
      Random rand=new Random();
      int d=rand.nextInt(7)+1;
      int n=rand.nextInt(7)+1;
      if(d==n){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
    }
  }
}