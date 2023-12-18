import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=sc.next();
		int a=s.replaceAll("R","" ).length();
		int b=s.replaceAll("B","" ).length();
		if(a>b) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}
	}

}
