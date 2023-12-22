
import java.io.*;
import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		FibonacciNumber fn = new FibonacciNumber(scan.nextInt());
		fn.show();
	}
}
class FibonacciNumber{
	int n=1;
	int target;
	int ans=1;
	public FibonacciNumber(int t){
		target=t;
	}
	void calc(int a, int b){
		if(target<2)
			return;
		ans=a+b;
		if(++n==target)
			return;
		calc(b,ans);
	}
	public void show(){
		calc(1,1);
		System.out.printf("%d\n",ans);
	}
}
class BubbleSort{
	int[] seq;
	int SwapCount;
	public BubbleSort(int length){
		seq=new int[length];
		SwapCount=0;
	}
	public void Load(int i,int num){
		seq[i]=num;
	}
	void Swap(int x, int y){
		int tmp=seq[x];
		seq[x]=seq[y];
		seq[y]=tmp;
		SwapCount++;
	}
	void Sort(){
		for(int i=0; i<seq.length;i++)
			for(int j=seq.length-1; j>i;j--)
				if(seq[j]<seq[j-1])
					Swap(j,j-1);
	}
	public void show(){
		Sort();
		for(int i=0;i<seq.length;i++)
			System.out.printf("%d ",seq[i]);
		System.out.printf("\n%d\n",SwapCount);
	}
}