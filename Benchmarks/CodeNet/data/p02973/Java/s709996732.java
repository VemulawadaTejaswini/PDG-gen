import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int n[] = new int[a];
		for(int i = 0; i < a; i++){
			n[i] = sc.nextInt();
		}
		ArrayList<Integer> b = new ArrayList<Integer>();
		int maxn,index,bj;
		b.add(n[0]);
		for(int i = 1; i < a; i++){
			index = -1;
			for(int j = 0; j < b.size(); j++){
				if(b.get(j) < n[i]){
					index = j;
					break;
				}
			}
			if(index != -1){
			b.set(index, n[i]);
			}
			else{
				b.add(0,n[i]);
			}
		}
		System.out.println(b.size());
	}
}