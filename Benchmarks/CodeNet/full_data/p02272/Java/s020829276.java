import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Main {
	static int count=0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		//????????????????????????
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		
		//?????????
		int n = Integer.parseInt(bf.readLine());
		ArrayList<Integer> array=new ArrayList<Integer>();
		String[] list=bf.readLine().split(" ");
		for(int i=0;i<n;i++){
			array.add(Integer.parseInt(list[i]));
		}
		
		mergeSort(array,0,n);
		
		for(int i=0;i<n;i++){
			System.out.printf("%d",array.get(i));
			if(i!=n-1){
				System.out.printf(" ");
			}
		}

		System.out.println("");
		System.out.println(count);
		
	}
	
	public static void mergeSort(ArrayList<Integer> array,int left,int right){
		if(left+1<right){
			int mid=(left+right)/2;
			mergeSort(array,left,mid);
			mergeSort(array,mid,right);
			merge(array,left,mid,right);
		}
	}
	
	public static void merge(ArrayList<Integer> array,int left,int mid,int right){
		int n1=mid-left;
		int n2=right-mid;
		
		ArrayList<Integer> leftArray=new ArrayList<Integer>();
		ArrayList<Integer> rightArray=new ArrayList<Integer>();
		
		for(int i=0;i<n1;i++){
			leftArray.add(array.get(left+i));
		}
		for(int i=0;i<n2;i++){
			rightArray.add(array.get(mid+i));
		}
		leftArray.add(500000);
		rightArray.add(500000);
		
		int i=0;
		int j=0;
//		System.out.println("left:right");
//		for(int l=0;l<leftArray.size();l++){
//			System.out.printf("%d ",leftArray.get(l));
//		}
//		for(int l=0;l<rightArray.size();l++){
//			System.out.printf("%d ",rightArray.get(l));
//		}
//		System.out.println("");
		for(int k=left;k<right;k++){
			count++;
			if(leftArray.get(i)<=rightArray.get(j)){
				array.set(k,leftArray.get(i));
				i=i+1;
			}else{
				array.set(k,rightArray.get(j));
				j=j+1;
			}
		}
//		System.out.println(""+left+" "+mid+" "+right);
//		for(int l=0;l<right;l++){
//			System.out.printf("%d ",array.get(l));
//		}
//		System.out.println("");
	}

}