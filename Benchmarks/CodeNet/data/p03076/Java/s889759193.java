import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		int A = 0;
		int B = 0;
		int C = 0;
		int D = 0;
		int E = 0;
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> ary = new ArrayList<Integer>();
		int i;
		for (i = 0; i < 5; i++) {
			int time = Integer.parseInt(sc.next());
			ary.add(i, time);
		}
		int max = 0;
		int dif=11;
		for (i = 0; i < 5; i++) {
			int remainder = ary.get(i) % 10;
			if (dif > remainder&&remainder!=0) {
				dif=remainder;
				max = i;
			}
		}
		double total=0;
		double temp=0;
		for (i = 0; i < 5; i++) {
			if(max!=i){
				temp=ary.get(i);
				temp=temp/10;
				total=total+(Math.ceil(temp)*10);
			}
			else{
				total=total+ary.get(i);
			}
		}
		System.out.println((int)total);
	}
}