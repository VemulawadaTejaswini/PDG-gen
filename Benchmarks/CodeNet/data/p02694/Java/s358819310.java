import java.util.Scanner;
//import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		int count = 0;
		int yokin = 100;
		while(true){
			yokin += yokin / 100;
			count++;
			if(yokin >= x){break;}
		}
		System.out.println(count);
	}
}
