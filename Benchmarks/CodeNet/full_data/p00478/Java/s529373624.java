import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int n = sc.nextInt();
		int count=0;
		for(int i=0;i<n;i++){
			String s = sc.next();
			s = s.concat(s);
			if(s.indexOf(str)!=-1) count++;
		}
		System.out.println(count);
	}
	
}

