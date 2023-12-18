import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);       
		int n = Integer.parseInt(sc.next());
		String[] s = new String[n];
		int m = 0;
		int a = 0;
		int r = 0;
		int c = 0;
		int h = 0;
		int[] march = new int[5];
        for(int i=0;i<n;i++){
            s[i] = sc.next();
            if(s[i].charAt(0) == 'M') {m++; march[0]++;}
            else if(s[i].charAt(0) == 'A') {a++; march[1]++;}
            else if(s[i].charAt(0) == 'R') {r++; march[2]++;}
            else if(s[i].charAt(0) == 'C') {c++; march[3]++;}
            else if(s[i].charAt(0) == 'H') {h++; march[4]++;}
        }
        long ans = 0;
        for(int i=0; i<n-2; i++) {
            for(int j=i+1; j<n-1; j++) {
                for(int k=j+1; k<n; k++) {
                    ans += march[i]*march[j]*march[k];
                }
            }
        }
        System.out.println(ans);
	}
}