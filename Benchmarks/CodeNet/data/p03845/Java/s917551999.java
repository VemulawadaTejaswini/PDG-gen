import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    public class Main {
    	public static void main(String[] args) {
    		Scanner sc = new Scanner(System.in);
    		int n = sc.nextInt();
    		int sum =0;
    		int tmp=0;
    		List<Integer> ans = new ArrayList<>();
    		List<Integer> list = new ArrayList<>();
    		for(int i=0;i<n;i++) {
    			tmp=sc.nextInt();
    			list.add(tmp);
    			sum+=tmp;
    		}
    		int m = sc.nextInt();
    		int cur =0;
    		for(int i=0;i<m;i++) {
    			cur=list.get(sc.nextInt()-1);
    			ans.add(sum-cur+sc.nextInt());
    		}
    		for(int i=0;i<m;i++) {
    			System.out.println(ans.get(i));
    		}

    	}
    }