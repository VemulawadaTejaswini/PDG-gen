import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner scn= new Scanner(System.in);
          int k = scn.nextInt();
          int a=scn.nextInt();
          int b=scn.nextInt();
          if(a%k==0 || b%k==0 || (b/k-a/k)>0){
        	  System.out.println("OK");
        	 
          }else{
        	  System.out.println("NG");
          }
         
	}

}