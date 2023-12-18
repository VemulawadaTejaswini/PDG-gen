import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		List<Integer> list1 = new ArrayList<>();
		list1.add(sc.nextInt());
		list1.add(sc.nextInt());
		list1.add(sc.nextInt());
		long k = sc.nextInt();
		int d = 0;
		for(int i = 0; i < k; i++){
			list1.add(list1.get(d) + list1.get(d + 2)); 
			list1.add(list1.get(d + 1) + list1.get(d));
			list1.add(list1.get(d + 2) + list1.get(d + 1));
			d += 3;
		}
		if(list1.get(d) - list1.get(d + 1) > Math.abs(Math.pow(10, 18))){
			System.out.println("Unfair");
		}else{
			System.out.println(list1.get(d) - list1.get(d + 1));
		}
	}
}