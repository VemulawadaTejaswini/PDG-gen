import java.util.Scanner;
class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();
	int[] X = new int[n];
	int[] T = new int[2021];

	for(int i=0;i<2021;i++){
	    T[i] = 0;
	}
	T[2020] = 1;
	for(int i=0;i<n;i++){
	    X[i] = sc.nextInt();
	    T[X[i]] = 1; 
	}
	int m = sc.nextInt();
	int[] A = new int[m];

	for(int i=0;i<m;i++){
	    A[i] = sc.nextInt();
	}

	for(int i=0;i<m;i++){
	    if(T[X[A[i]-1] +1] == 1 || X[A[i]-1] +1 == 2020){
		//System.out.print(X[A[i]-1]);
		//System.out.print(T[X[A[i]-1]]);
		continue;
	    }else{
		T[X[A[i]-1]+1] = 1;
		T[X[A[i]-1]] = 0;	
		X[A[i]-1] += 1;
	    }
	}

	for(int i=0;i<n;i++){
	    System.out.println(X[i]);
	}
    }

}

