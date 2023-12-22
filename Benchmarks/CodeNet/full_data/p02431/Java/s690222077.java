import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		List<Integer> sales = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		
		for(int i = 0;i<a;i++){
			int x = sc.nextInt();
			if(x == 0){
				sales.add(sc.nextInt());
			}else if(x == 1){
				System.out.println(sales.get(sc.nextInt()));
			}else{
				sales.remove(sales.size()-1);
			}
		}
		
	}
}

