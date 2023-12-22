import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){

			List<Integer> lst = new ArrayList<Integer>();
			int input;
			int cnt=0;
			while((input = sc.nextInt())!=0 && cnt < 10000) {
				if(input>=0 && input <=10000){
					lst.add(input);
					cnt++;
				}
			}
			Integer[] aaa = lst.toArray(new Integer[0]);
			int[] ary = new int[lst.size()];
			for(int i = 0; i<lst.size(); i++) {
				ary[i] = aaa[i];
			}
			
			for(int i=0; i< ary.length ; i++) {
				System.out.println(String.format("Case %d: %d",i+1,ary[i]));
			}
		}
	}
}