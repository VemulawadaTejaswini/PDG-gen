
import java.io.*;
import java.util.*;


public class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		Heap heap = new Heap(scan.nextInt());
		scan.nextLine();
		heap.Load(scan.nextLine());
		heap.BuildMaxHeap();
		heap.show();
	}
}

class Heap{
	int HeapSize;
	int[] list;
	public Heap(int hs){
		HeapSize = hs;
		list = new int[hs+1];
	}

	public void Load(String line){
		String[] tmp = line.split(" ");
		for(int i=0; i<HeapSize;i++)
			list[i+1]=Integer.parseInt(tmp[i]);
	}
/*	void SortLeaf(){
		for(int i=HeapSize/2;i<HeapSize; ){
			int left=i++;
			int right=i++;
			if(right>HeapSize)
				break;
			if(list[left]>list[right])
				Swap(left,right);
		}
	}*/
	void Swap(int x, int y){
		int tmp=list[x];
		list[x]=list[y];
		list[y]=tmp;
	}
	void MaxHeap(int index){
		int left=index*2;
		int right=left+1;
		int largest=index;
		if(left<=HeapSize && list[left]>list[index])
			largest=left;
		if(right<=HeapSize && list[right]>list[largest])
			largest=right;
		if(largest!=index){
			Swap(index,largest);
			MaxHeap(largest);
		}
	}
	public void BuildMaxHeap(){
	//	SortLeaf();
		for(int i=HeapSize/2;i>0 ;i--)
			MaxHeap(i);
	}
	
	public void show(){
		for(int i=1; i<HeapSize+1;i++)
			System.out.printf(" %d",list[i]);
		System.out.printf("\n");
	}
	
}