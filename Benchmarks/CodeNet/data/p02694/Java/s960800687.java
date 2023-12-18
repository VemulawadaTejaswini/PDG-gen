import java.util.Scanner;
//import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int count = 0;
		long yokin = 100;
		while(true){
			yokin += yokin / 100;
			count++;
			if(yokin >= x){break;}
		}
		System.out.println(count);
	}
}
