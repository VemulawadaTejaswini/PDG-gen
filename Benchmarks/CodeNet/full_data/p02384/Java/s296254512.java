import java.io.*;
import java.util.Scanner;

public class Main{
	public static void main(String[] arsg) throws IOException{
		Scanner scan = new Scanner(System.in);
		
		int[] x = new int[6];
		
		for(int i = 0;i<6;i++){
			x[i] = scan.nextInt();
		}
		int y = scan.nextInt();
		
		for(int i = 0;i<y;i++){
			int a = scan.nextInt();
			int b = scan.nextInt();
			if(b==2&&a==1||
			   b==1&&a==5||
			   b==5&&a==6||
			   b==6&&a==2){
			   	System.out.println(x[2]);
			}
			else if(b==1&&a==3||
			        b==4&&a==1||
			        b==6&&a==4||
			         b==3&&a==6){
			   	System.out.println(x[1]);
			}			
			else if(b==2&&a==4||
			        b==4&&a==5||
			        b==5&&a==3||
			        b==3&&a==2){
			   	System.out.println(x[0]);
			}
			else if(b==1&&a==2||
			        b==2&&a==6||
			        b==6&&a==5||
			        b==5&&a==1){
			   	System.out.println(x[3]);
			}				
			else if(b==1&&a==4||
			        b==3&&a==1||
			        b==6&&a==3||
			        b==4&&a==6){
			   	System.out.println(x[4]);
			}			
			else if(b==2&&a==3||
			        b==3&&a==5||
			        b==5&&a==4||
			        b==4&&a==2){
			   	System.out.println(x[5]);
			}					
		}
	}
}
					