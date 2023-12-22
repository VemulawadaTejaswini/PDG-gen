import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true){
			int n = sc.nextInt();	
			int k = sc.nextInt();	
			int m = sc.nextInt()-1;
			if(n+k+m<=0)break;
			List<Integer>list= new LinkedList<Integer>();
			for (int i = 0; i < n; i++) {
				list.add(i);
			}
			int cur = m;
			list.remove(cur);
			cur--;
			for (int j = 0; j < n-2; j++) {
				for (int i = 0; i < k; i++) {
					cur = (cur+1)%list.size();
				}
				list.remove(cur);
				cur--;
			}
			System.out.println(list.get(0)+1);
		}

	}

}