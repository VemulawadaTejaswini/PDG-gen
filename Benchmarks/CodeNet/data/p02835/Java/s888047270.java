import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list=new ArrayList<Integer>();
		//Integer[][] array = new Integer[m][m];
		int n = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int a = n+b+c;
		if(a>=22)
			System.out.println("bust");
		else
			System.out.println("win");
	}
}