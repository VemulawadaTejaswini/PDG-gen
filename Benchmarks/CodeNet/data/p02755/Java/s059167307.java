import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		int n = scn.nextInt();
		int b = scn.nextInt();
		for(int i=0;i<=1000;i++){
		   if(Math.floor((i*0.08))==n && Math.floor((i*0.1))==b){
			   System.out.println(i);
			   return;
		   }
		}
		System.out.println("-1");
		

	}

}
