
import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		TreeSet<Integer> ts = new TreeSet<Integer>();
		for(int i=1; i < n; i++){
			ts.add((i*i)%n);
		}
		int [] list = new int[(n-1)/2 + 1];
		for(Integer i: ts){
			for(Integer j: ts){
				if(i== j){
					continue;
				}
				int result = i - j;
				if(result < 0){
					result += n;
				}
				//計算結果が (n-1)/2 =5 より大きい場合 n=11 から減算します。
				if(result > (n-1) / 2){
					result = n - result;
				}
				list[result]++;
			}
		}

		//print
		for(int i=1; i < list.length; i++){
			System.out.println(list[i]);
		}
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();
	}
}