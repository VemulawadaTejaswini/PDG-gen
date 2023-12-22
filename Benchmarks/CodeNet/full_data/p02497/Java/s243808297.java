import java.io.*;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int i = 0;
		while(i == 0){
			int m = sc.nextInt();
			int f = sc.nextInt();
			int r = sc.nextInt();
			if(m == -1){
				if(f == -1){
					if(r == -1){
						break;
					}
				}else{
					System.out.println("F");
				}
			}else if(f == -1){
				System.out.println("F");
			}else{
				if(m+f>=80){
					System.out.println("A");
				}else if(m+f<80 && m+f >=65){
					System.out.println("B");
				}else if(m+f<65 && m+f >=50){
					System.out.println("C");
				}else if(m+f<50 && m+f >=30){
					if(r>=50){
						System.out.println("C");
					}else{
						System.out.println("D");
					}
				}else{
					System.out.println("F");
				}
			}
		}
	}	
}