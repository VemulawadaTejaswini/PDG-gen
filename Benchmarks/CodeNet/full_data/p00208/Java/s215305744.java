import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		while(n!=0){
			int i =0; int j;
			 for(int count=0; count!=n; i++){
				 j = i;
				 if(j%10==4 || j%10==6){
					 } else if(j<10){
							 count = count + 1;
						 }else{
							 while(j>10){
								 j = j/10;
								 if(j%10==4 || j%10==6){
									 break;
								 }else if(j<10){
									 count = count + 1;
								 }
							 }
						 }
					 
			 }
			 System.out.println(i);
			 n = scan.nextInt();
		}
	}
}