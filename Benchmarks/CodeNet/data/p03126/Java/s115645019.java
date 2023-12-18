
import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static final int MAX_N = 30;
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		int[][] a = new int[n][MAX_N];
		for(int i=0; i<n; i++){
			int k = Integer.parseInt(sc.next());
            if (k == 0) break;
            for(int j=0; j<k; j++) {
                a[i][j] = sc.nextInt();
            }
		}
    	sc.close();
    	HashSet<Integer> hs = new HashSet<>();
    	for (int i=0; i<a[0].length;i++){
    		hs.add(a[0][i]);
    	}
    	hs.remove(0);
    	for(int i=0; i<n; i++){
    		HashSet<Integer> hso = new HashSet<>();
    		for (int j=0; j<a[i].length;j++){
        		hso.add(a[i][j]);
        	}
    		hs.retainAll(hso);
    	}
    	System.out.println(hs.size());
	}

}
