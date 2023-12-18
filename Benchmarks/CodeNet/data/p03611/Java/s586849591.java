import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] data = new int[N];
		for(int i = 0 ; i<N; i++){
			data[i] = sc.nextInt();
		}
		Arrays.sort(data);
		int res = 0;
		for(int i = 0 ; i<N; i++){
			int target = data[i];
			int judge = 0;
			for(int j = 0 ; j<N; j++){
				if(data[j] == target || data[j] == target+1 || data[j] == target -1){
					judge++;
				}
				else if(data[j]>target+1){
					break;
				}
			}
			if(judge > res )res = judge;
		}
		System.out.println(res);
	}
}
