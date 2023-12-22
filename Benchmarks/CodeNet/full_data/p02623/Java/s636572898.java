import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		long k = scan.nextInt();
		Deque<Long> a = new ArrayDeque<>();
		Deque<Long> b = new ArrayDeque<>();
		long ans = 0;
		int read = 0;
		
		for(int i=0;i<n;i++) {
			long oppai = scan.nextLong();
			a.add(oppai);
		}
		for(int i=0;i<m;i++) {
			long oppai = scan.nextLong();
			b.add(oppai);
		}
		
		long a_now = a.poll();
		long b_now = b.poll();
		
		boolean a_zero = false;
		boolean b_zero = false;
		
		while(true) {
			if(a_zero && b_zero) {
				break;
			}else if(a_zero) {
				if(b_now+ans > k) {
					break;
				}else {
					ans += b_now;
					read += 1;
					if(b.size()==0) {
						b_zero = true;
					}else {
						b_now = b.poll();
					}
				}
			}else if(b_zero) {
				if(a_now+ans > k) {
					break;
				}else {
					ans += a_now;
					read += 1;
					if(a.size()==0) {
						a_zero = true;
					}else {
						a_now = a.poll();
					}
				}
			}else {
				if(a_now <= b_now) {
					if(a_now+ans > k) {
						break;
					}else {
						ans += a_now;
						read += 1;
						if(a.size()==0) {
							a_zero = true;
						}else {
							a_now = a.poll();
						}
					}
				}else {
					if(b_now + ans > k) {
						break;
					}else {
						ans += b_now;
						read += 1;
						if(b.size()==0) {
							b_zero = true;
						}else {
							b_now = b.poll();
						}
					}
				}
			}
		}
		
		
		System.out.println(read);
		
		
		
		
	}
}
 