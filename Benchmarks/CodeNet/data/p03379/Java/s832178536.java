import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
        	a[i] = sc.nextInt();
        	list.add(a[i]);
        }
        Collections.sort(list);
        int [] ans = {list.get(n/2-1),list.get(n/2)};
        for(int i = 0; i < n; i++) {
        	System.out.println(ans[judge(a[i],ans)]);
        }
    }

    static int judge(int x, int[]ans) {
    	if(x <= ans[0]) {
    		return 1;
    	}
    	return 0;
    }
}