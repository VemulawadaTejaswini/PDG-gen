import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int N = sc.nextInt(), L = sc.nextInt();
		//String[] array = new String[N];
		String s=sc.next();
		int sum=0;
		for(int i=0;i<s.length();i++) {
			sum+=Integer.parseInt(s.substring(i,i+1));
		}
		if(Integer.parseInt(s)%sum==0) {
			System.out.println("Yes");//Yes or YES注意
		}else {
			System.out.println("No");
		}

	}
	public static int sample(int n) {
		return n;
	}

}
