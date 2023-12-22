

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		
		int[] arr=new int[n];
		int[] res=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=scanner.nextInt();
		}
		res[0]=arr[0];
		int length=1;
		for(int i=1;i<n;i++){
			if(res[length-1]<arr[i])
				res[length++]=arr[i];
			else{
				int p=lowbound(res,0,length,arr[i]);
				//System.out.println(p);
				res[p]=arr[i];
			}
		}
		System.out.println(length);
	}

	private static int lowbound(int[] arr, int beg, int end, int x) {
		// TODO Auto-generated method stub
		int mid=(beg+end)/2;
		while(beg<end){
			if(x<=arr[mid])
				end=mid;
			else beg=mid+1;
			mid=(beg+end)/2;
		}
		return beg;
	}

}

