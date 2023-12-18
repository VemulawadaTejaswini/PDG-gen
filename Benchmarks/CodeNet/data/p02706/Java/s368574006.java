import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list=new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list=new ArrayList<Integer>();
		//int[] array = new int[2000000];
		int n = sc.nextInt();
		int m = sc.nextInt();
		int count=0;
		for(int i=0;m>i;i++) {
			int a = sc.nextInt();
			count=count+a;
		}
		if(n>=count)
			System.out.println(n-count);
		else
			System.out.println(-1);
	}
}