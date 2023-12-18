import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//要素数受け取り
		int n = sc.nextInt();
		int sum = 0;
		Integer [] list = new Integer[n];
		for(int i = 0; i < n; i ++){
			list[i] = sc.nextInt();
		}
		Arrays.sort(list,Collections.reverseOrder());
		if(n%2 == 0){
			for(int t = 0; t < n-1; t += 2){
				sum += list[t] - list[t+1];
				}
			}else{
				for(int t = 0; t < n-2; t += 2){
					sum += list[t] - list[t+1];
				}
				sum += list[n-1];
			}
			System.out.println(sum);
		}
}
