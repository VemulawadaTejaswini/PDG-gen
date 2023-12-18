//AtCoder Beginner Contest 140 C

import java.util.Scanner;

public class Main{
    static int N;
    static int A[];
    static int B[];
    static int C[];

    public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	N = sc.nextInt();
	A = new int[N];
	B = new int[N - 1];
	C = new int[N - 1];
	int ans = 0;
	for(int i = 0; i < N; i++){
	    A[i] = 99999;
	}
	for(int i = 0; i < (N - 1); i++){
	    B[i] = sc.nextInt();
	}

	for(int i = 0; i < (N - 1); i++){
	    sort(i);
	}

	for(int i = 0; i < (N - 1); i++){
	    int num = C[i];
	    System.out.println("num : " + num);
	    if(A[num] == 99999){
		A[num] = B[num];
	    }
	    if(A[num + 1] == 99999){
		A[num + 1] = B[num];
	    }
	}

	for(int i = 0; i < N; i++){
	    if(A[i] == 99999){
		A[i] = B[i];
	    }
	    System.out.println("A : " + A[i]);
	    ans = ans + A[i];
	}
	System.out.println(ans);
    }

    static void sort(int i){
	for(int j = 0; j < i; j++){
	    if(C[j] == i && i + 1 < N){
		    i++;
	    }
	}
	int min = B[i];
	int minNum = i;


	for(int h = 0; h < N-1; h++) {
	    if(min >= B[h]) {
		int check = 0;
		for(int j = 0; j < i; j++){
		    if(C[j] == h){
			check = 1;;
		    }
		}
		if(check != 1){
		    min = B[h];
		    minNum = h;
		}
	    }
	}
	C[i] = minNum;
    }
}
