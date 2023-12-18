import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		sc.close();
		sc = null;
		int i;
		List<Integer> white = new ArrayList<>();
		List<Integer> black = new ArrayList<>();
		if(s.charAt(0)=='#') {
			white.add(0);
		}
		char pre = '\0';
		int preidx = 0;
		for(i=0;i<n;i++) {
			if(pre == '#' && s.charAt(i) == '.'){
				black.add(i-preidx);
				preidx = i;
			} else if(pre == '.' && s.charAt(i) == '#') {
				white.add(i-preidx);
				preidx = i;
			}
			pre = s.charAt(i);
		}
		
		if(s.charAt(n-1)=='.') {
			white.add(i-preidx);
			black.add(0);
		} else {
			black.add(i-preidx);
		}
		int min=200000;
		int sum=0;
		int j;
		for(i=0; i<= white.size(); i++) {
			sum = 0;
			for(j=0;j<i;j++) {
				sum+=black.get(j);
			}
			for(;j<white.size();j++) {
				sum+=white.get(j);
			}
			min = Math.min(min, sum);
		}
		System.out.println(min);
		
	}
}