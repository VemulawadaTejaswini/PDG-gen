package PriorityQue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	private static int[] que;
	private static int count;
	public static void main(String[] args)throws IOException{
		que = new int[1000000];
		count =0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String[] str=br.readLine().split(" ");
			if(str[0].equals("end")) break;
			else if(str[0].equals("extract")) extract();
			else if(str[0].equals("insert")){
				int n=Integer.parseInt(str[1]);
				insert(n);
			}
		}
	}
	
	private static void extract(){
		System.out.println(" "+que[1]);
		for(int i=2;i<=count;i++) que[i-1]=que[i];
		count--;
		maxHeap(1);
	}
	
	private static void insert(int n){
		count++;
		que[count]=n;
		for(int i=n/2;i>=1;i--) maxHeap(i);
	}
	
	private static void maxHeap(int i){
		int l=2*i;
		int r=2*i+1;
		int max;
		if(l<=count && que[l]>que[i]) max=l;
		else max=i;
		if(r<=count && que[r]>que[max]) max=r;
		
		if(max!=i){
			int tmp=que[i];
			que[i]=que[max];
			que[max]=tmp;
			maxHeap(max);
		}
	}
	
}