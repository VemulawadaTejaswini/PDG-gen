import java.util.Scanner;
public class Main {
	static  int A[]=new int[10000];
	static int cout=0,K=0;
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		K=stdIn.nextInt();
		int max=1;
		boolean ans=false;
		String k="";
		if(K<10){
			System.out.println(K);
			System.exit(0);
		}
		else
			K-=9;
		while(ans==false){
			for(int i=1;i<=9;i++){
				A[0]=i;
				if(dfs(1,max,i)){
					ans=true;
					break;
				}
			}
			System.out.println(cout);
			max++;
		}
		for(int i=0;i<max;i++){
			k+=String.valueOf(A[i]);
		}
		System.out.println(k);
	}
	public static boolean dfs(int now,int max,int b){
		int a=b-1;
		if(a<0)
			a=0;
		A[now]=a;
		if(now==max){
			cout++;
			if(cout==K)
				return true;
			for(int i=0;i<2;i++){
				a++;
				if(a>9||a>b+1)
					return false;
				A[now]=a;
				cout++;
				if(cout==K)
					return true;
			}
			return false;
		}
		else{
			for(int i=0;i<2;i++){
				if(dfs(now+1,max,a)==false){
					a++;
					if(a>9||a>b+1)
						return false;
					A[now]=a;
				}
				else
					return true;
			}
		}
		return false;
	}
}
