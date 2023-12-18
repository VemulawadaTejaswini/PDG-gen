import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//int a = sc.nextInt();
		//List<Integer> check=new ArrayList<Integer>();
		//array = new int[h+1][w+1];
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		//Collections.reverse(list);

		int n=sc.nextInt();
		int answer=0;
		for(int i=1;n+1>i;i++) {
			answer=answer+(i%n);
		}

		System.out.println(answer);
	}

}
