import java.util.*;

public class Main{
	public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int m=sc.nextInt();
      int a=1;
      for(int i=m/n;true;i--){
      	if(m%i==0){
        	
      System.out.println(i);
        }
      }
    
    }


}