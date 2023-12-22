import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		label:for(;;){
			int N=cin.nextInt();
			if(N==0)break;
			int[] node=new int[27];
			int[][] edge=new int[27][27];
			boolean[] already=new boolean[27];
			Arrays.fill(already, true);
			for(int i=0;i<N;i++){
				String s  =cin.next();
				char a = s.charAt(0);
				char b = s.charAt(s.length()-1);
				int aa=a-'a';
				int bb=b-'a';
				node[aa]++;
				node[bb]++;
				already[aa]=already[bb]=false;
				edge[aa][bb]++;
				edge[bb][aa]++;
			}
			for(int i=0;i<27;i++){
//				System.out.println(node[i]);
				if(node[i]%2!=0){
					System.out.println("NG");
					continue label;
				}
			}
			Stack<Integer>stack=new Stack<Integer>();
			for(int i=0;i<27;i++){
				if(!already[i]){
					stack.add(i);
					break;
				}
			}
			while(!stack.isEmpty()){
				int a = stack.pop();
				if(already[a])continue;
				already[a]=true;
				for(int i=0;i<27;i++){
					//					if(edge[a][i]>=1){
					//						int c=edge[a][i];
					//						edge[a][i]=edge[i][a]=c-1;
					if(edge[a][i]>0){
						edge[a][i]--;
						edge[i][a]--;
						stack.push(i);	
					}
					
				}
			}
			for(int i=0;i<27;i++){
				if(!already[i]){
					System.out.println("NG");
					continue label;
				}
			}
			System.out.println("OK");
		}
	}

}