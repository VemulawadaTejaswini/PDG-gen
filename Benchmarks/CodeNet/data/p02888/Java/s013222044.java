import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	static int[] L = new int[2001];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String str = br.readLine();
		
		int[] map = new int[1001];
		String[] word = str.split("\\s+");
		 L = new int[N];
		for(int i=0;i<N;i++){
			L[i] = Integer.parseInt(word[i]);
			map[L[i]]++;
		}
		Arrays.sort(L);
		
//		N*(N-1)*(N-2)/6;
// [b,a+b];有多少个值
	//	a+b  > c 肯定构成  三角
		
		int M = L[N-1]+L[N-1];
		List<Node> list = new ArrayList<Node>();
		for(int i=0;i<N;i++){
			for(int j=i+1;j<N;j++){
				Node node = new Node(i, j);
				list.add(node);
			}
		}
		
		int res = 0;
		
		for(int i=0,size=list.size();i<size;i++){
			Node node = list.get(i);
			int sum = node.sum;
			int maxIndex = node.index2;
			
			for(int j=maxIndex+1;j<N;j++){
				if(   L[j] <  sum ){
					res ++;
				}
			}
		}
		System.out.println(res);
	}
/**
 * a+b 结果。。。。。。。。这么多个值V{index1,index2,a,b,sum};     {1,5,1,1,2} 
 * c<a+b的有sum中再从index2+1中到N搜索   
 */
		
		private static class Node {
			int index1;
			int index2;
			int a;
			int b;
			int sum;
			
			public Node(int index1,int index2){
				this.index1 = index1;
				this.index2 = index2;
				this.a = L[index1];
				this.b = L[index2];
				this.sum = this.a + this.b;
			}
		}
	
		
		
		
}