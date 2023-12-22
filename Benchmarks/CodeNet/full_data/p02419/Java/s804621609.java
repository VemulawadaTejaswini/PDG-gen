import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String a;
		int count=0;
		while(true){
			a = sc.next();
			if(a.equals("END_OF_TEXT"))break;
			if(a.equals(str))count++;
		}
		System.out.println(count);
	}
}
