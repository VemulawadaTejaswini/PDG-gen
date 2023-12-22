import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			ArrayList<Integer> list = new ArrayList<Integer>();
		int n = sc.nextInt();
		int m = sc.nextInt();
		if(n == 0 && m == 0)break;
		for(int i = 1; i <= n; i++)
			list.add(i);
		
		int x = -1;
		while(list.size() != 1){
			x = (x + n) % list.size();
			list.remove(x);
			x = x - 1;
		}
		System.out.println(list.get(0));	
		}
		}
}