import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        int v, i, j;
        for(i=0;i<n;i++){
            A[i] = sc.nextInt();
        }
        for(int k=0;k<n;k++){
	    if(k==n-1){
		System.out.println(A[k]); 
	    }
	    else{
		System.out.print(A[k]+" ");
	    }
	}
        for(i=1;i<n;i++){
            v = A[i];
            j = i -1;
            while(j>=0 && A[j]>v){
                A[j+1] = A[j];
                j=j-1;
            }
            A[j+1] = v;
            for(int k=0;k<n;k++){
                if(k==n-1){
                    System.out.println(A[k]); 
                }
                else{
                    System.out.print(A[k]+" ");
                }
            }
        }
    }
}

