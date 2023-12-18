import java.util.*;

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
	}else if(be == true){  //どこかで1に戻る
	    K = K%cou;
	    int nowst = 1;
	    for(int i=0;i<K;i++){
		nowst = A[nowst-1];
	    }
	    System.out.print(nowst);
	}else{                        //1には戻ってこない
	    //K = K%(N-count);
	    Set<Integer> sss = new HashSet<Integer>();

	    int pla2=1;
	    sss.add(pla2);
	    int cou2=0;
	    for(int i=0;i<N;i++){
		pla2=A[pla-1];
		sss.add(pla2);
		cou2++;
		if(cou2 +1 != sss.size()){
		    break;
		}
	    }

	    int pla3=pla2;
	    int cou3=0;
	    for(int i=0;i<N;i++){
		pla3=A[pla3-1];
		cou3++;
		if(pla3==pla2){
		    break;
		}
	    }

	    K = (K-cou2)%cou3;
	    
	    int nowst = pla2;
	    for(int i=0;i<K;i++){
		nowst = A[nowst-1];
	    }
	    System.out.print(nowst);
	}
    }
}
