import java.util.Arrays;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        while(x.hasNext()){
            int m=x.nextInt();
            int[] A=new int[m];
            for(int i=0;i<m;i++){
                A[i]=x.nextInt();
            }
			Show(A);
            int n =A.length;
            for(int i=1;i<n;i++){
		        int j=i;
		        while(j>=1 && A[j-1] > A[j]){
			        int temp = A[j];
			        A[j]=A[j-1];
			        A[j-1]=temp;
			        j--;
					
		        }Show(A);
		    }
		   break;
	    }
    }
	public static void Show(int[] A){
	    int i;
		for(i=0;i<A.length-1;i++){
			System.out.print(A[i]+" ");
		}
		System.out.println(A[i]);
	}
}
