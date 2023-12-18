import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int x = sc.nextInt();
		int[] data = new int[N];
		long res = 0;
		for(int i = 0 ; i<N; i++){
			data[i] = sc.nextInt();
		}
		for(int i = 0 ; i<N-1; i++){
			if(data[i]+data[i+1] > x){
				int index = data[i] > data[i+1] ? i:i+1;
				res+=data[i]+data[i+1]-x;
				data[index]-=(res);
			}
		}
		System.out.println(res);
	}
}
