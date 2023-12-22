import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] num=new int[10];
		for(int i=0; i<N; i++){
			for(int j=0; j<10; j++){
				num[j]=sc.nextInt();
			}
			if(dfs(0,0,0,num))System.out.println("YES");
			else System.out.println("NO");
		}
	}
	
	static boolean dfs(int pos, int l, int r, int[] num){
		if(pos==10)return true;
		
		boolean flag1 = false;
		boolean flag2 = false;
		if(l<num[pos])flag1=dfs(pos+1,num[pos],r,num);
		if(r<num[pos])flag2=dfs(pos+1,l,num[pos],num);
		
		if(flag1==true || flag2==true)return true;
		else return false;
	}
}