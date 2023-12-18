import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list=new ArrayList<Integer>();
		//Integer[] array = new Integer[m];
		double d = sc.nextDouble();
		int n = sc.nextInt();
		d = Math.pow(100, d);
		if(n==100) {
			System.out.println((int)d*n+(int)d);
		}
		else {
			System.out.println((int)d*n);
		}
	}
}