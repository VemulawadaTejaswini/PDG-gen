import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println(donuts(sc));
	}


	static int donuts(Scanner sc){
		int n = sc.nextInt();
		int m = sc.nextInt();


		int min = 999999;
		List<Integer> l = new ArrayList<Integer>();
		for(int i = 0 ; i < n ; ++i){
			int a = sc.nextInt();
			l.add(a);
			if(min > a){
				min = a;
			}
			m = m - a;
		}


		return  m/min + l.size();
	}
}