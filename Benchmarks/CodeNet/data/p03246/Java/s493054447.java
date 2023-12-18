import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String[] tmpArray = br.readLine().split(" ");

		int[] input = new int[n];

		for(int i = 0; i < n; i++){
			input[i] = Integer.parseInt(tmpArray[i]);
		}

		Node[] odd = new Node[100001];
		Node[] even = new Node[100001];

		for(int i = 0; i < odd.length; i++){
			odd[i] = new Node(i, 0);
			even[i] = new Node(i, 0);

		}

		for(int i = 0; i < n/2; i++){
			odd[input[2*i]].num++;
			even[input[2*i + 1]].num++;
		}

		//debug
//		for(int i = 0; i < 10; i++){
//			System.out.print(odd[i] + " ");
//		}
//
//		System.out.println();
//
//		for(int i = 0; i < 10; i++){
//			System.out.print(even[i] + " ");
//		}
//
//		System.out.println();

		Arrays.sort(odd);
		Arrays.sort(even);

		int result = 0;
		if(odd[0].index != even[0].index){
			result = n - odd[0].num - even[0].num;
		}
		else {
			if(odd[0].num >= even[0].num){
				result = n - odd[0].num - even[1].num;
			}
			else {
				result = n - even[0].num - odd[1].num;
			}
		}

		System.out.println(result);
	}

}

class Node implements Comparable<Node>{
	int index;
	int num;

	Node(int i, int n){
		index = i;
		num = n;
	}

	@Override
	public int compareTo(Node o) {
		return -this.num + o.num;
	}


}