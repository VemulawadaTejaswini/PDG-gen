import java.io.*;
import java.util.*;

public class aoj10028{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		try{
			int n=scan.nextInt();
			int temp;
			ArrayList<Integer> x=new ArrayList<Integer>();
			/*
			ArrayList ans=new ArrayList();
			ArrayList notUse=new ArrayList();
			int INF=100000000;
			int min;
			*/
			for(int i=0;i<n;i++){
				x.add(scan.nextInt());
				//notUse.add(true);
			}
			for(int i=0;i<n;i++){
				for(int j=i;j<n;j++){
					if(x.get(i)>x.get(j)){
						temp=x.get(i);
						x.set(i,x.get(j));
						x.set(j,temp);
					}
				}
			}
			for(int i=0;i<n-1;i++){
				System.out.print(x.get(i)+" ");
			}
			System.out.println(x.get(n-1));
		}catch(NumberFormatException e){
			System.out.println(e);
		}
	}
	/*
	private static int[] binarySort(int num[]){
		int left=0;
		int right=num.length;
		int center=right/2;
		int temp;
		while(left<right){
			while(num[left]<num[center]){
				left++;
			while(num[center]<num[right]){
				right--;
			}
			if(left<right){
				temp=num[left];
				num[left]=num[right];
				num[right]=temp;
			}
		}
		if(1<center){
			binarySort(num[])
	}
	*/
}