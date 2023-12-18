import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list_gold=new ArrayList<Integer>();
		//Integer[] Republican = new Integer[m];
		int r = sc.nextInt();
		int d = sc.nextInt();
		int x = sc.nextInt();
		for(int i=0;10>i;i++) {
			int a = r*x-d;
			System.out.println(a);
			x=a;
		}
	}

}

