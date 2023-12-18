import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class Main{
	static ArrayList<Integer>[] map;
	static int[] ch;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		map=new ArrayList[n];
		ch=new int[n];
		for(int i=0; i<n; i++){
			map[i]=new ArrayList<>();
		}
		for(int i=0; i<m; i++){
			int a =sc.nextInt()-1;
			int b =sc.nextInt()-1;
			map[a].add(b);
			map[b].add(a);
		}
		Arrays.fill(ch,2);
		if(dfs(0,0)){
			long count=0;
			for(int i=0; i<n; i++){
				if(ch[i]==0){
					count++;
				}
			}
			System.out.println(count*(n-count)-m);
		}else{
			System.out.println((long)n*(n-1)/2-m);
		}
	}
	static boolean dfs(int now,int count){
		if(ch[now]==2){
			ch[now]=count%2;
		}else{
			if(ch[now]!=count%2){
				return false;
			}else{
				return true;
			}
		}
		for(int i:map[now]){
			if(!dfs(i,count+1)){
				return false;
			}
		}
		return true;
	}
}
