import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int a =scn.nextInt();
		long b=scn.nextLong();
		int [] arr =new int[a];
		for(int i=0;i<arr.length;i++){
			arr[i]=scn.nextInt();
			arr[i]--;
		}
		int [] arr2 = new int[arr.length];
		int count=0;
		int count1=0;
		int i=0;
		 while(true){
			 if(arr2[i]!=0){
				// System.out.println(i);
				 break;
			 }
			 arr2[i]++;
			 i=arr[i];
			
			 count1++;
		 }
		 while(true){
			 if(arr2[i]==2){
				 break;
			 }
			 arr2[i]++;
			 i=arr[i];
			 
			 count++;
		 }
		// count--;
		// System.out.println(count);
		long val= (b-count1)%count;
		//System.out.println(val);
		
		while(val>0){
			i=arr[i];
			val--;
		}
		System.out.println(i+1);

	}

}