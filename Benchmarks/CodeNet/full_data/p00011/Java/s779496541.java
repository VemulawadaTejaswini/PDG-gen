import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> w_list = new ArrayList<Integer>();
		
		int w = sc.nextInt();
		int n = sc.nextInt();
		
		for(int i = 0; i < w; i++){
			w_list.add(i + 1);
		}
		
		for(int i = 0; i < n; i++){
			String[] str = sc.next().split(",");
			
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);
			
			int tmp_a = w_list.get(a - 1);
			int tmp_b = w_list.get(b - 1);
			
			w_list.set(a - 1, tmp_b);
			w_list.set(b - 1, tmp_a);
		}
		
		print(w_list);
	}
	
	public static void print(ArrayList<Integer> a) {
		for(int i = 0; i < a.size(); i++)
			System.out.println(a.get(i));
	}
}