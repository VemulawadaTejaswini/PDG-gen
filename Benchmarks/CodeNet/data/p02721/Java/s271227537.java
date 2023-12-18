import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int C = sc.nextInt();
        String S = sc.next();
    	List<Integer> result = new ArrayList<>();
    	int maxWorkDays;
    	for (int i=0; i<N; i++) {
    		if (S.charAt(i) == 'x') {
    			continue;
    		} else {
				String L = S.substring(0, Math.max(1, i));
				String R = S.substring(Math.min(N-1, i+1), N);
				if (i == 0) {
					maxWorkDays = calcMax("x"+R, C);
				} else if (i == N-1) {
					maxWorkDays = calcMax(L+"x", C);
				} else {
					maxWorkDays = calcMax(L+'x'+R, C);
				}
				if (maxWorkDays < K) {
					result.add(i+1);
				}
    		}
    	}
    	for (int d: result) {
    		System.out.println(d);
    	}
    }

  	public static int calcMax(String s, int c){
  		int current_work_day = -c-1;
  		int work_days = 0;
  		for (int i=0; i<s.length(); i++) {
  			if(i < current_work_day+c+1) {
  				continue;
  			} else if (s.charAt(i) == 'o') {
  				work_days += 1;
  				current_work_day = i;
  			}
  		}
  		return work_days;
    }
}