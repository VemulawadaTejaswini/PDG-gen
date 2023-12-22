import java.util.Scanner;


public class Main{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] S = new int[n];
		for(int i=0;i<n;i++){
			S[i] = input.nextInt();
		}
		int count = 1;
		Merge merge = new Merge(S,n,count);
		merge.publicMergeSort();
		for(int j=0;j<n;j++){
			if(j>0) System.out.print(" ");
			System.out.print(S[j]);
		}
		System.out.println("");
		System.out.println(merge.getCount());
	}
}

class Merge{
	private int[] theArray;
	private int nElems;
	private int count;
	
	public Merge(int[] theArray, int nElems,int count) {
		this.theArray = theArray;
		this.nElems = nElems;
		this.count = count;
	}
	public void publicMergeSort(){
		int[] workSpace = new int[nElems];
		mergeSort(workSpace,0,nElems-1);
	}
	public void mergeSort(int[] workSpace,int lowerBound,int upperBound){
		if(lowerBound==upperBound) {
			count++;
			return;
		}
		else{
			int mid = (lowerBound + upperBound) / 2;
			mergeSort(workSpace,lowerBound,mid);
			mergeSort(workSpace,mid+1,upperBound);
			
			merge(workSpace,lowerBound,mid+1,upperBound);
		}
	}
	//upper????????????????´??????????highptr????????????(??????????????????
	public void merge(int[] workSpace,int lowPtr,int highPtr, int upperBound){
		int j = 0;
		int lowerBound = lowPtr;
		int n = upperBound - lowerBound + 1;
		int mid = highPtr -1;
		while(lowPtr<=mid && highPtr<=upperBound){
			if(theArray[lowPtr]>theArray[highPtr]){
				workSpace[j++]=theArray[highPtr++];
		
			}else{
				workSpace[j++]=theArray[lowPtr++];
				
			}
			count++;
		}
			while(lowPtr<=mid){
				workSpace[j++] = theArray[lowPtr++];
			}
			while(highPtr<=upperBound){
				workSpace[j++] = theArray[highPtr++];
			}
			for(j = 0;j<n;j++){
				theArray[lowerBound+j] = workSpace[j];
			}
		}
	public int getCount(){
		return count;
	}
}