import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sca=new Scanner(System.in);	
		int size=sca.nextInt();
		int arr[]=new int[size];
		
			for(int i=0;i<size;i++){
				arr[i]=sca.nextInt();
			}
			
			buildMaxHeap(size,arr);
			for(int i=0;i<size;i++){
				System.out.println(" "+arr[i]);
			}
			
	}
	
	public static void maxHeapify(int size,int arr[],int index){
		int left=index*2+1;
		int right=index*2+2;
		int large=0;
		int largeIndex=index;
		
		if(left<size && arr[largeIndex]<arr[left]){
			largeIndex=left;
			large=arr[left];
		}
		if(right<size && arr[largeIndex]<arr[right]){
			largeIndex=right;
			large=arr[right];
		}
		if(largeIndex!=index){
			arr[largeIndex]=arr[index];
			arr[index]=large;
			maxHeapify(size,arr,largeIndex);
		}
		
	}
	
	public static void buildMaxHeap(int size,int arr[]){
		for(int i=size/2;i>=0;i--){
			maxHeapify(size,arr,i);
		}
	}
	
}




