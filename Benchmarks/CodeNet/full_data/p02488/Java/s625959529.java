import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int count=scanner.nextInt();
		String[] s=new String[count];
		for(int i=0;i<count;i++){
			s[i]=scanner.next();
		}
		Arrays.sort(s);
		System.out.println(s[0]);
	}

}