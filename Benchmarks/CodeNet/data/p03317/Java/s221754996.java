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
      System.out.println(N / (K - 1) );
    }
}