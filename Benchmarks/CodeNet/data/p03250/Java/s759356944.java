import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		List<Integer> list1 = new ArrayList<>();
		for(int i = 0; i<3; i++){
		    int a = sc.nextInt();
			list1.add(a);
		}
		Collections.sort(list1);
		System.out.println(list1.get(2)*10+list1.get(0)+list1.get(1));
	}
}