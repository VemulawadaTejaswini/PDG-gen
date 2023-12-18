import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		int w = sc.nextInt();
		String[] array = a.split("");
		for(int i=0;i<array.length;i++) {
			if((i%w)==0)System.out.println(array[i]);
		}
	return ;
	}
}