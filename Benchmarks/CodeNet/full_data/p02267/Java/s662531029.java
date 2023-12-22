import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	
	int n = new Scanner(System.in).nextInt();
	int[] A = new int[n];

	for(int i= 0; i < n; i++ ) {
	    A[i] = new Scanner(System.in).nextInt();
	}
	int sum = 0;
	
	int q = new Scanner(System.in).nextInt();
	for(int i = 0; i < q; i++ ){
	    int key = new Scanner(System.in).nextInt();
	    if(search(A,n,key)) sum++;
	}
	System.out.println(sum);
    }
    private static boolean search(int A[], int n, int key){
	int i = 0;
	A[n] = key;
	while (A[i] != key) i++;
	return i != n;
    }	
}

