import java.util.*;
public class Main{
  public static void main(String[] args)throws Exception{
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    for(N=3;N<=100;N++){
      Random rand=new Random();
      int DN1=rand.nextInt(7)+1;
      int DN2=rand.nextInt(7)+1;
      if(DN1==DN2){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
    }
  }
}