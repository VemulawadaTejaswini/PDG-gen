import java.util.Scanner;


public class Main {
	
	public static void insertionSort(int [] A,int index){
		Integer i,j,k,v;
		
		for(k=0;k<index;k++){
			System.out.print(A[k]);
			if(k!=index-1)System.out.print(" ");
		}
		System.out.println();
		for(i=1;i<index;i++){
			v = A[i];
			j=i-1;
			
			while(j>=0 && A[j] > v){
				A[j+1] = A[j];
				j--;
				
			}
			A[j+1] = v;
			for(k=0;k<index;k++){
				System.out.print(A[k]);
				if(k!=index-1)System.out.print(" ");
			}
			System.out.println();
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		Integer i,n = sc.nextInt();
		int [] box = new int [n];
		
		
		for(i=0;i<n;i++){
			box[i] = sc.nextInt();
		}
		insertionSort(box,n);
	}

}
