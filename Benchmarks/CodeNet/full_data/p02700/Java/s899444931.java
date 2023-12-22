import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list=new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list=new ArrayList<Integer>();
		//int[] array = new int[n];
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		while(true) {
			c=c-b;
			if(c<1) {
				System.out.println("Yes");
				break;
			}
			a=a-d;
			if(a<1) {
				System.out.println("No");
				break;
			}
		}
	}
}