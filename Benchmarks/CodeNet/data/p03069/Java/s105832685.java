import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		sc.close();
		sc = null;
		int i;
		int[] white = new int[10000];
		int[] black = new int[10000];
		int widx=0,bidx=0;
		if(s.charAt(0)=='#') {
			white[widx++]=0;
		}
		char pre = '\0';
		int preidx = 0;
		for(i=0;i<n;i++) {
			if(pre == '#' && s.charAt(i) == '.'){
				black[bidx++]=i-preidx;
				preidx = i;
			} else if(pre == '.' && s.charAt(i) == '#') {
				white[widx++]=i-preidx;
				preidx = i;
			}
			pre = s.charAt(i);
		}
		
		if(s.charAt(n-1)=='.') {
			white[widx++]=i-preidx;
			black[bidx++]=0;
		} else {
			black[bidx++]=i-preidx;
		}
		int min=200000;
		int sum=0;
		int j;
		for(i=0; i< bidx; i++) {
			sum = 0;
			for(j=0;j<i;j++) {
				sum+=black[j];
			}
			for(++j;j<widx;j++) {
				sum+=white[j];
			}
			min = Math.min(min, sum);
		}
		System.out.println(min);
		
	}
}
