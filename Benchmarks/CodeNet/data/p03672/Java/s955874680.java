import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), K = sc.nextInt();
		int [] l = new int[N];
		int max = 1, sum = 0, count = 0,maxIndex = -1;
		for(int i = 0; i < l.length; i++) {
			l[i] = sc.nextInt();
		}
		while(count < K) {
			for(int i = 0; i < l.length; i++) {
				if(l[i] > max) {
					max = l[i];
					maxIndex = i;
				}
			}
			sum += max;
			l[maxIndex] = -1;
			max = 1;
			count++;
		}
		System.out.println(sum);
	}

}