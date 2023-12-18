import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> list=new ArrayList<>();
		int[] count=new int[n];
		int number=0;
		for(int i=0;i<n;i++){
			list.add(sc.nextInt());
		}
		Collections.sort(list);
		for(int i=0;i<list.size();i++){
			count[list.get(i)]++;
		}
		for(int i=0;i<n;i++){
			if(count[i]>0)number++;
		}
		
		if(number%2==0)System.out.println(number-1);
		else System.out.println(number);
	}
}
