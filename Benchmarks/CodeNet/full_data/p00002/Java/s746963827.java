import java.io.*;
import java.util.Scanner;

class Main{
	public static void main(String[] args){
		//try{
			Scanner sc = new Scanner(System.in);
			while(sc.hasNextLine()){
				int a = sc.nextInt();
				int b = sc.nextInt();
				
				//System.out.printf("%d %d\n",a,b);
				int c = a+b;
				for(int j = 1;j<14;j++){
						if((c-Math.pow(10,j))<0){
							System.out.printf("%d\n",j);
							break;
						}
				}
			}
		/*}catch(EOFException e){
			System.out.println("+e+");
		}*/
	}
}