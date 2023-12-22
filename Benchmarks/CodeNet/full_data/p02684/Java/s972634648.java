import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	long K = sc.nextLong();
	int[] A = new int[N];

	int count = 0;
	for(int i=0;i<N;i++){
	    A[i] = sc.nextInt();
	    if(A[i] == i+1) count++;
	}

	int pla=1;
	int cou=0;
	boolean be = false;
	for(int i=0;i<N;i++){
	    pla=A[pla-1];
	    cou++;
	    if(pla==1){
		be = true;
		break;
	    }
	}

      


	
	
	if(count==N){
	    System.out.print(1);
	}else if(be == true){
	    K = K%cou;
	    int nowst = 1;
	    for(int i=0;i<K;i++){
		nowst = A[nowst-1];
	    }
	    System.out.print(nowst);
	}else{
	    //K = K%(N-count);
	    int nowst = 1;
	    for(int i=0;i<K;i++){
		nowst = A[nowst-1];
	    }
	    System.out.print(nowst);
	}
    }
}
