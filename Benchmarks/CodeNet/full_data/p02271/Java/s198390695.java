import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		while(sc.hasNext()){
			int N = sc.nextInt();
			int[] arr = new int[N];
			for(int i=0;i<arr.length;i++){
				arr[i] = sc.nextInt();
			}
			int q = sc.nextInt();
			int[] target = new int[q];
			for(int i=0;i<q;i++){
				target[i] = sc.nextInt();
			}
			for(int i=0;i<q;i++){
				boolean res =  solve(0,target[i],arr);
				if(res){
					System.out.println("yes");
				}else{
					System.out.println("no");
				}
			}
		}
	}
	public static  boolean solve(int i,int m,int[] A){
		if(m==0) return true; 
		if(i>=A.length) return false;
		boolean res = solve(i+1,m,A) || solve(i+1,m-A[i],A);
		return res; 
	}
}