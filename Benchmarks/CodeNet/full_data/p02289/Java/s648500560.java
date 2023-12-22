package PriorityQue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	private static int[] que;
	private static int count;
	public static void main(String[] args)throws IOException{
		que = new int[2000000];
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
		int max=que[1];
		System.out.println(max);
		que[1]=que[count];
		count--;
		maxHeap(1);
	}
	
	private static void insert(int n){
		count++;
		que[count]=Integer.MIN_VALUE;
		que[count] = n;
        int i = count;
        while (i > 1 && que[i/2] < que[i]) {
        	int tmp=que[i];
        	que[i]=que[i/2];
        	que[i/2]=tmp;
            i = i/2;
        }
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