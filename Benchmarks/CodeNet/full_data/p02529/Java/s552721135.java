//AOJ10030FñðJEg·évO
import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] search = new int[n];
		for(int i=0; i < n; i++){
			search[i] = sc.nextInt();
		}
		Arrays.sort(search);
		int m = sc.nextInt();
		int count =0;

		for(int i=0; i < m; i++){

			int patt = sc.nextInt();
			int left =0;
			int right = n-1;
			while(left < right){
				int mid = (right + left)/2;
				if(search[mid] < patt){
					left = mid +1;
				}
				else{
					right = mid;
				}
			}
			if(search[left] == patt){
				while(search[left] == patt){
					count++;
					left++;
				}
			}
		}
		System.out.println(count);

	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}