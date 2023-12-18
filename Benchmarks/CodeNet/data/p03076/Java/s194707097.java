import java.util.Arrays;
import java.util.Scanner;



class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	 int A[] = new int [5];
    	 int total=0;

    	 int ans=0;

    	 int C[] = new int[5];
    	 for(int i =0;i<5;i++){
    		A[i]=sc.nextInt();
    		total += A[i];

    		C[i] = A[i]%10;
    		if(C[i]!=0){
    		C[i]= 10-C[i];
    		ans += C[i];
    		}


    	 }
    	 Arrays.sort(C);

    	 System.out.println(ans+total-C[4]);

    }

}