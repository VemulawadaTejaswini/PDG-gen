import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	public static final int MAX = 13;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			final long n = sc.nextLong();
			
			if(n == 0L){
				break;
			}
			
			StringBuilder sb = new StringBuilder();
			long rest = n;
			boolean m_flag = false;
			while(rest != 0){
				long a = rest / (10);
				long b = rest - a * (10);
				
				if(b < 0 & !m_flag){
					b += (10);
					a -= 1;
				}else if(b > 0 && m_flag){
					b -= (10);
					a += 1;
				}
				
				if(b < 0){
					b = -b;
				}
				
				sb.insert(0, b);
				rest = a;
				m_flag = !m_flag;
			} 
			
			System.out.println(sb.toString());
		}
	}
}