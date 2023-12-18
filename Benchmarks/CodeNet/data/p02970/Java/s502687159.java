import java.util.Scanner;

public class Main{
	public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int d=sc.nextInt();
      int sta=d*2+1;
      for(int i=0;i<20;i++){
      if(sta*i>=n){
      System.out.println(i);
        break;
      }
      }

    }
}
