import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int  x=scn.nextInt();
		int y=scn.nextInt();
		int a=scn.nextInt();
		int b=scn.nextInt();
		int c=scn.nextInt();
		int []arr =new int[a];
		int [] arr1=new int[b];
           int [] arr2=new int[c];
           for(int i=0;i<a;i++){
        	   arr[i]=scn.nextInt();
           }
          for(int i=0;i<b;i++){
        	  arr1[i]=scn.nextInt();
          }
          for(int i=0;i<c;i++){
        	  arr2[i]=scn.nextInt();
        	  
          }
          
          
         
         System.out.println(res(arr,arr1 ,arr2 ,x, y));
	}
	public static long res(int [] arr1,int [] arr2 ,int [] arr3,int x,int y){
		PriorityQueue<Integer> pq =new PriorityQueue<>();
		for(int i=0;i<arr1.length;i++){
			if(pq.size()<x){
				pq.add(arr1[i]);
			}else{
				if(pq.peek()<arr1[i]){
					pq.remove();
					pq.add(arr1[i]);
				}
			}
		}
		PriorityQueue<Integer> pq1 = new PriorityQueue<>();
		for(int i=0;i<arr2.length;i++){
			if(pq1.size()<y){
				pq1.add(arr2[i]);
			}else{
				if(pq1.peek()<arr2[i]){
					pq1.remove();
					pq1.add(arr2[i]);
				}
			}
		}
		while(pq1.size()>0){
			pq.add(pq1.remove());
		}
		for(int i=0;i<arr3.length;i++){
			if(pq.size()<(x+y)){
				pq.add(arr3[i]);
			}else{
				if(pq.peek()<arr3[i]){
					pq.remove();
					pq.add(arr3[i]);
				}
			}
		}
		
		long sum=0;
		while(pq.size()>0){
			sum+=pq.remove();
		}
		return sum;
		
	}

}