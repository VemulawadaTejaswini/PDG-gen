import java.util.*;

public class Main{
  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 1;
		String[] str = new String[N];
		for(int i = 0;i < N;i++) {
			String x = sc.next();
			str[i] += x; 
		}
		for(int i = 0;i < N;i++) {
			try {
				if(str[i].equals(str[i+1])) {
					
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