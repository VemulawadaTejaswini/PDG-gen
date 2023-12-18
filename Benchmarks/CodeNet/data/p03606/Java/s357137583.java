import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		int N =sc.nextInt();



		List<Integer>list=new ArrayList<Integer>();
		for(int i=0;i<N;i++) {
			int aa=sc.nextInt();
                        int bb=sc.nextInt();

			list.add(bb-aa);
			//System.out.println(a);
		}
		int ans=0;
		for(int i=0;i<list.size();i++){
			ans+=list.get(i)+1;
		}

		System.out.println(ans);

	}
}