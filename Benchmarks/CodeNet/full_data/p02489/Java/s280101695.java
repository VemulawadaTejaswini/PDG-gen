import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int count = 0;
		while(true){
			int i = sc.nextInt();
			if(i != 0) {
				System.out.println("Case"+" "+count+": "+i);
				count++;
			}
			else {break;}
		}
	}
}