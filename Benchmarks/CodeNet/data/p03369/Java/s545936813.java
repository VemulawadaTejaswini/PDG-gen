import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String source=sc.next();
		char s1=source.charAt(0);
		char s2=source.charAt(1);
		char s3=source.charAt(2);

		int price=700;

		if(s1=='○'){
			price+=100;
		}
		if(s2=='○'){
			price+=100;
		}

		if(s3=='○'){
			price+=100;
		}

		System.out.println(price);
	}
}
