import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	static int ans;

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();
        solve(n, k, s);
    }

    static void solve(int n, int k, String s) {
    	List<Integer> list = new ArrayList<>();
    	method(list, s);

    	ans = 0;
    	for(int i = 0; i < list.size(); i++) {
    		int tmp = sum(list,i,k);
    		ans = Math.max(ans, tmp);
    	}
    	System.out.println(ans);
    }

    static int sum(List<Integer> list, int index, int num) {
    	int sum = 0;
    	int count = 0;
    	boolean boo = true;
    	while(index < list.size()) {
    		int tmp = list.get(index);
    		if(tmp < 0) {
    			count++;
    		}
    		if(count > num) {
    			boo = false;
    			break;
    		}
    		sum += Math.abs(tmp);
    		index++;
    	}
    	if(boo) {
    		System.out.println(Math.max(sum, ans));
    		System.exit(0);
    	}
    	return sum;
    }

    static void method(List<Integer> list, String s) {
    	int i = 0;
    	while(i < s.length()) {
    		int count = 0;
    		int j = i;
    		while(j < s.length() && s.charAt(i) == s.charAt(j)) {
    			count++;
    			j++;
    		}
    		if(s.charAt(i) == '1') {
    			list.add(count);
    		} else {
    			list.add(count * -1);
    		}
    		i = j;
    	}
    }
}