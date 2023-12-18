import java.util.*;

public class Main{
	public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int m=sc.nextInt();
      int a=1;
      for(int i=1;n*i<=m;i++){
      	if(m%i==0){
        	a=i;
        }
      }
      System.out.println(a);
    
    }


}