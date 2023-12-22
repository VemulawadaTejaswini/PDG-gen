import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int a,b;
		boolean is;
		
		while(true){
			a = sc.nextInt();
			b = sc.nextInt();
			
			if(a == 0 && b == 0)break;
			is = true;
			
			for(int i = a; i <= b; i++){
				if(i % 400 == 0){
					list.add(i);
					is = false;
					continue;
				}
				else if(i % 100 == 0){
					continue;
				}
				else if(i % 4 == 0){
					list.add(i);
					is = false;
				}
			}
			if(is)
				System.out.println("NA");
			else
				for(int i = 0; i < list.size(); i++){
					System.out.println(list.get(i));
				}
			
			list.clear();
			System.out.println();
		}
		sc.close();
	}
}