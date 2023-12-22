import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	void doIt() {
		while(true){
			int n = sc.nextInt();
			if(n == 0)break;
			int a[] = new int [n];
			for(int i = 0;i < n;i++){
				a[i] = sc.nextInt();
			}
			Arrays.sort(a);
			int ans = sc.nextInt();
			int cnt = 0;
			int s = 0;
			int g = n-1;
			while(true){
				cnt++;
				if(s == g)break;
				int m = (s + g) / 2;
				if(a[m] == ans)break;
				else{
					if(a[m] < ans){
						s = m + 1;
					}else{
						g = m - 1;
					}
				}
			}
			System.out.println(cnt);
		}
     }
	public static void main(String[] args) {
    	// TODO Auto-generated method stub
    	new Main().doIt();
    }
}