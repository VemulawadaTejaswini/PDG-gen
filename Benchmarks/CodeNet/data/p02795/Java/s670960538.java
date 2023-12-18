import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list=new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list=new ArrayList<Integer>();
		//int[] array_k = new int[100000];
		int h = sc.nextInt();
		int w = sc.nextInt();
		int n = sc.nextInt();
		int large = 0;
		if(h>w) {
			large=h;
		}
		else {
			large=w;
		}
		int count=0;
		int answer=0;
		for(int i=0;large>i;i++) {
			count=count+large;
			answer++;
			if(count>=n) {
				System.out.println(answer);
				System.exit(0);
			}
		}
	}
}