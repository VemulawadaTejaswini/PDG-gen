import java.util.Scanner;
public class Main{
	public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
      int W=sc.nextInt();
      int H=sc.nextInt();
      int x=sc.nextInt();
      int y=sc.nextInt();
      int k;
      int total=W*H;
      if(x*H>y*W){
      System.out.println(total-x*H);
      System.out.println(0);
      }else if(x*H<y*W){
      System.out.println(total-y*W);
        System.out.println(0);
      }else{
      System.out.println(total-x*H);
      System.out.println(1);
      }
      
      
      
      
      
    }
}