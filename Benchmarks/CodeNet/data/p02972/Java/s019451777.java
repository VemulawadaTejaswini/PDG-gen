import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		Deque<Integer> ans = new ArrayDeque<Integer>();
		int N=stdIn.nextInt();
		int A[]=new int[N];
		int B[]=new int[N];
		int z=0,y=2,x=0;
		while(z<N){
			A[z]=stdIn.nextInt();
			z++;
		}z=N-1;
		while(z>=0){
			if(z<N/2)
				break;
			if(A[z]==1){
				ans.add(z+1);x++;
			}
			z--;
		}z=N/2;
		while(z>1){
			while(y<=z){
				if(z*y>N)
					break;
				B[z]+=A[z*y-1];
				if(z!=y)
					B[y]+=A[z*y-1];
				y++;
			}y=2;
			if(B[z]%2==0&&A[z-1]==1){
				ans.add(z);x++;
			}
			if(B[z]%2==1&&A[z-1]==0){
				ans.add(z);x++;
			}
			z--;
		}z=0;
		if(x%2==1&&A[0]==0)
			ans.add(1);
		if(x%2==0&&A[0]==1)
			ans.add(1);
		System.out.println(ans.size());
		x=ans.size();
		while(z<x){
			System.out.println(ans.removeLast());
			z++;
		}
	}
}