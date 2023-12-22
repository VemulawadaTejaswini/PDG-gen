import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int size=in.nextInt();
		myMaxHeap heap=new myMaxHeap();
		
		for(int i=0;i<size;i++)heap.add(Integer.parseInt(in.next()));
		
		heap.build();
		heap.dump(new PrintWriter(System.out));
	}

}

class myMaxHeap{
	private int size=0,array[]=new int[500001];
	
	myMaxHeap() {
		
	}
	
	
	
	public void add(int v) {
		size++;
		array[size]=v;
	}
	
	public void build() {
		for(int i=size/2;i>=1;i--) {
			tailor(i);
		}
	}
	
	private void tailor(int i) {
		int indexL=i*2,indexR=i*2+1,max=i;
		
		if(indexL<=size && array[indexL] > array[max])max=indexL;
		if(indexR<=size && array[indexR] > array[max])max=indexR;
		
		if(max!=i) {
			//System.out.println("swap "+array[max]+" "+array[i]);
			int tt=array[i];
			array[i]=array[max];
			array[max]=tt;
			
			tailor(max);
		}
	}
	
	public void dump(PrintWriter out) {
		for(int i=1;i<=size;i++)out.print(" "+array[i]);
		out.println();
		out.flush();
	}
	
	
}
