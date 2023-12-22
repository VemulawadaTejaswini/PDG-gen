import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        ArrayList<Integer> A = new ArrayList<>();

        for(int i = 0; i < n; i++) {
        	int query = sc.nextInt();

        	if(query == 0) {
        		int x = sc.nextInt();
        		A.add(x);
        	}
        	if(query == 1) {
        		int p = sc.nextInt();
        		System.out.println(A.get(p));
        	}
        	if(query == 2) {
        		A.remove(A.size() - 1);
        	}
        }
	}

}

