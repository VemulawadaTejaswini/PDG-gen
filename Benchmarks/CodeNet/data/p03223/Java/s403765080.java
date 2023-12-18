import java.util.*;
import java.io.*;

public class Main {
    public static long solve(LinkedList<Integer> a){
    	int N = a.size();
    	long ans = 0;
    	int prev = a.remove((N-1)/2);
    	
    	boolean top = false;
    	while(! a.isEmpty()){
    		int cur = top ? a.removeFirst() : a.removeLast();
    		ans += Math.abs(cur-prev);
    		top = !top;
    		prev = cur;
    	}
    	return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> A = new ArrayList<>(N);
        for(int n=0;n<N;n++) A.add(sc.nextInt());
        
        Collections.sort(A);
        LinkedList<Integer> a = new LinkedList<>(A);
        Collections.reverse(A);
        LinkedList<Integer> b = new LinkedList<>(A);
        
        System.out.println(Math.max(solve(a),solve(b)));
        
    }
}