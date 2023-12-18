import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt(),X = sc.nextInt(), Y = sc.nextInt();
	int[] cnt_list = new int[N-1];
	int l= 0;
	for(int i=1;i<N;i++) {
		for(int j=i+1;j<N+1;j++) {
//			System.out.println("i:"+i+"j:"+j);
			if(i>=Y||j<=X) {
				l = j-i;
				cnt_list[l-1]++;
			}else {
				int another = Math.abs(i-X)+Math.abs(j-Y)+1;
//				System.out.println(another);
				l = Integer.min(j-i, another);
				cnt_list[l-1]++;	
			}
//			System.out.println(Arrays.toString(cnt_list));
		}
	}
	for(int cnt:cnt_list) {
		System.out.println(cnt);
	}
}
}
