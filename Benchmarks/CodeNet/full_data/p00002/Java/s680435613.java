import java.util.Scanner;

public class A {
	public static void main(String a[]){	
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int s = a+b;
			int c = 0;
			while(s!=0){
				s = s/10;
				c++;
			}
			System.out.println(c);
		}
		scanner.close();
	}
}

