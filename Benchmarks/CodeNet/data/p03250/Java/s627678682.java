import java.util.Arrays;
import java.util.Scanner;



class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);

    	int A[] = new int[3];
    	for(int i = 0;i<3;i++){
    		A[i]=sc.nextInt();
    	}

    Arrays.sort(A);

    A[2]=A[2]*10;
    int B = A[1]+A[2];
    
    System.out.println(B+A[0]);



    }

}