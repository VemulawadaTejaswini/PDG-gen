import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str1;
		while(s.hasNext()){
		str1 = s.nextLine();
		str1=str1.toUpperCase();
		System.out.println(str1);
		}
	}
}