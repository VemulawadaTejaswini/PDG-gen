import java.io.*;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		while(true){
			try{
				int h=scan.nextInt();
				int w=scan.nextInt();;
				if(h==0 && w==0){
					break;
				}
				for(int i=0;i<h;i++){
					if(i==0 || i==h-1){
						for(int j=0;j<w;j++){
							System.out.print("#");
						}
					}else{
						System.out.print("#");
						for(int j=1;j<w-1;j++){
							System.out.print(".");
						}
						System.out.print("#");
					}
					System.out.println();
				}
				System.out.println();
			}catch(NumberFormatException e){
				break;
			}
		}
	}
}