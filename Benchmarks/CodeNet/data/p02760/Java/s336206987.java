import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		
		int[] A = new int[10];
        for(int i=1; i<10; i++) {
			A[i] = keyboard.nextInt();
		}

		int N = keyboard.nextInt();
		int[] B = new int[N+1];
		
		for(int j=1; j<N+1; j++) {
			B[j] = keyboard.nextInt();
		}
		
		int[] A2 = new int[10];
		for(int a=1; a<10; a++) {
			for(int b=1; b<N+1; b++) {
			    if(A[a]==B[b]) { 
                    A2[a] =1; }
		    }
		}
		
		String ans = "No";
		if (A2[1]==1 && A2[2]==1 && A2[3]==1 ) {
		    ans = "Yes";
	    }else if (A2[4]==1 && A2[5]==1 && A2[6]==1 ) {
		    ans = "Yes";
		}else if (A2[7]==1 && A2[8]==1 && A2[9]==1 ) {
		    ans = "Yes";
		}else if (A2[1]==1 && A2[4]==1 && A2[7]==1 ) {
		    ans = "Yes";
		}else if (A2[2]==1 && A2[5]==1 && A2[8]==1 ) {
		    ans = "Yes";
		}else if (A2[3]==1 && A2[6]==1 && A2[9]==1 ) {
		    ans = "Yes";
		}else if (A2[1]==1 && A2[5]==1 && A2[9]==1 ) {
		    ans = "Yes";
		}else if (A2[3]==1 && A2[5]==1 && A2[7]==1 ) {
		    ans = "Yes";
		}
		
		System.out.println(ans);
		keyboard.close();
	}
}
