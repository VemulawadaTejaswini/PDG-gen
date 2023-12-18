import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] s = new int[M];
		int[] c = new int[M];
		int ans = -1;
		
		for(int j=0; j<M ;j++) {
			s[j] = sc.nextInt();
			c[j] = sc.nextInt();
		}
		
		if(N==1) {
			for(int i=0; i<10 ;i++) {
				int check = 0;
				for(int j=0; j<M ;j++) {
					if(s[j]==1 && c[j] == i) check++;
				}
				if(check == M) {
					ans = i;
					break;
				}
			}
		}else if(N==2) {
			for(int i=10; i<100 ;i++) {
				int check = 0;
				for(int j=0; j<M ;j++) {
					if(s[j]==1 && c[j] == i%100/10) check++;
					if(s[j]==2 && c[j] == i%10) check++;
				}
				if(check == M) {
					ans = i;
					break;
				}
			}
		}else if(N==3) {
			for(int i=100; i<1000 ;i++) {
				int check = 0;
				for(int j=0; j<M ;j++) {
					if(s[j]==1 && c[j] == i/100) check++;
					if(s[j]==2 && c[j] == (i%100)/10) check++;
					if(s[j]==3 && c[j] == i%10) check++;
				}
				if(check == M) {
					ans = i;
					break;
				}
			}
			
			
		}
		System.out.println(ans);

	}
}


