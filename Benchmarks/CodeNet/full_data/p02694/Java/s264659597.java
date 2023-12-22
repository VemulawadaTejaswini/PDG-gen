import java.util.Scanner;
//import java.util.Arrays;
public class Main{
	static Scanner sc = new Scanner(System.in);
	static long x = sc.nextLong();
	
	public static void main(String[] args){
		
		int count = 0;
		int yokin = 100;
		while(true){
			if(check100(yokin)){
				yokin += yokin;
				count += 100;
			}else{
				yokin += yokin / 100;
				count++;
				if(yokin >= x){break;}
			}
		}
		System.out.println(count);
	}
	
	static boolean check100(long y){
		y += y;
		return !(y >= x);
	}
}
