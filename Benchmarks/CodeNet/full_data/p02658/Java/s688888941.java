import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		List<Integer> list=new ArrayList<Integer>();
		long sum=1;
		for(int i=0;i<N;i++) {
			list.add(sc.nextInt());

		}
		for(int i=0;i<list.size();i++) {
			sum=sum*list.get(i);
		}
		int length=String.valueOf(sum).length();
		if(length>17) {
			System.out.println(-1);
		}else {
			System.out.print(sum);
		}
			sc.close();


	}

}
