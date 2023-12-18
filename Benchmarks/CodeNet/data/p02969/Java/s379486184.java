import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//int a = sc.nextInt();
		//List<Integer> check=new ArrayList<Integer>();
		//array = new int[h+1][w+1];
		List<Integer> list=new ArrayList<Integer>();
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		//Collections.reverse(list);

		int a = sc.nextInt();

		int answer = (int)Math.pow(a, 2);

		System.out.println((int)3*answer);
	}

}
