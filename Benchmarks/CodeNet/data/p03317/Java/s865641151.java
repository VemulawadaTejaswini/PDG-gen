import java.util.Scanner;

class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt(), K = sc.nextInt();
	int index_one = -1;
	for(int i = 0; i < N; i++){
	    int A = sc.nextInt();
	    if(A == 1) index_one = i;
	}
	int L = index_one, R = N - index_one - 1;
	System.out.println((L + 1) / 2 + (R + 1) / 2);
    }
}
