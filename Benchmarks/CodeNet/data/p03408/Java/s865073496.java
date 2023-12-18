import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = Integer.parseInt(sc.next());
    	List<String> S = new ArrayList<String>();
    	for (int i=0; i<N; i++){
    		S.add(sc.next());
    	}
    	List<String> T = new ArrayList<String>();
    	int M = Integer.parseInt(sc.next());
    	for (int i=0; i<M; i++){
    		T.add(sc.next());
    	}
    	
    	int ans = 0;
    	for(String s: S){
    		int ans_tmp = 0;
    		for(String s1: S){
    			if (s.equals(s1)){
    				ans_tmp++;
    			}
    		}
    		for(String t:T){
    			if (s.equals(t)){
    				ans_tmp--;
    			}
    		}
    		if (ans < ans_tmp){
    			ans = ans_tmp;
    		}
    	}
    	System.out.println(ans);
    }
}
