import java.util.*;

public class Main{
  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long count = 1;
		String[] str = new String[(int) N];
		for(long i = 0;i < N;i++) {
			String x = sc.next();
			str[(int) i] += x; 
		}
		for(long j = 0;j < N;j++) {
			try {
				if(str[(int) j].equals(str[(int) (j+1)])) {
					
				}else {
					count++;
				}
			}catch(ArrayIndexOutOfBoundsException e){
				break;
			}
		}
		System.out.println(count);
	}
}