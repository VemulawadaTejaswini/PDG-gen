import java.io.*;
import java.util.*;
public class Main{
	public static void main(String args[]) throws Exception{
		Scanner cin= new Scanner(System.in);
		final int n= cin.nextInt();
		int[] A    =new int[n];
		int[] DPlen=new int[n+1]; //DPlen[i]:長さi+1の増加部分列のうちの、[0]最小要素/[1]そのindex。
		int intMAX= (int)Math.pow(10d,9d)+1;
		
		A[0]= cin.nextInt();
		DPlen[0]= A[0];
		
		int k;
		for(k=1;k<n+1;k++){
			DPlen[k]= intMAX;
		}
		
		int i;
		for(i=1;i<n;i++){
			A[i]= cin.nextInt();
			int index = Arrays.binarySearch(DPlen, A[i]);
			if( index<0 ){
				index= ~index;
				DPlen[index]= A[i];
			}
		}
		
		i=0;
		while( DPlen[i]!=intMAX ){
			i++;
		}
		System.out.println(i);
	}
}