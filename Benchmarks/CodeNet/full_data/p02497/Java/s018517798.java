import java.io.InputStreamReader;
import java.util.Scanner;


public class Main{
	public static void main(String[] args){
		Scanner scan= null;
		try{
			scan = new Scanner(new InputStreamReader(System.in));
			while(scan.hasNext()){
				int m = scan.nextInt();
				int f = scan.nextInt();
				int r = scan.nextInt();
				if((m == -1) && ( f == -1) &&( r == -1))break;
				if((m == -1) || ( f == -1)){
					print("F");
				}else if ((m + f) >=80){
					print("A");
				}else if ((m + f) >=65){
					print("B");
				}else if ((m + f) >=50){
					print("C");
				}else if((m + f) >= 30){
					if(r >= 50){
						print("C");
					}else
						print("D");
				}else if((m + f) >= 0){
					print("F");
				}
			}
		}finally{
			scan.close();
		}
	}
	public static void print(String s){
		System.out.println(s);
	}
}