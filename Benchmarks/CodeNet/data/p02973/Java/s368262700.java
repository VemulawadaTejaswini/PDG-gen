import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int n[] = new int[a];
		for(int i = 0; i < a; i++){
			n[i] = sc.nextInt();
		}
		LinkedList<Integer> b = new LinkedList<Integer>();
		int maxn,index,bj;
		b.add(n[0]);
		for(int i = 1; i < a; i++){
			maxn = 0;
			index = -1;
			for(int j = 0; j < b.size(); j++){
				bj = b.get(j);
				if(bj < n[i] && maxn < bj){
					maxn = bj;
					index = j;
				}
			}
			if(index != -1){
			b.set(index, n[i]);
			}
			else{
				b.add(n[i]);
			}
		}
		System.out.println(b.size());
	}
}
