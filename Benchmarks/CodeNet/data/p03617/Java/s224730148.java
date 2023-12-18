import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	long Q = in.nextLong() * 800;
    	long H = in.nextLong() * 400;
    	long S = in.nextLong() * 200;
    	long D = in.nextLong() * 100;

    	long N = in.nextLong() * 100;

    	long P[] = new long[4];
    	int PNUM[] = new int[4];//Pの添え字を格納する
    	for(int cnt = 0;cnt < 4; cnt++){
    		PNUM[cnt] = cnt;
    	}

    	long sum = 0;

    	P[0] = Q;
    	P[1] = H;
    	P[2] = S;
    	P[3] = D;

    	//小さい順にソート
    	for(int cnt = 0; cnt < 4; cnt++){
    		long tmp;
    		int tmp2;
    		for(int cnt2 = cnt + 1; cnt2 < 4; cnt2++){
    			if(P[cnt] > P[cnt2]){
    				tmp = P[cnt];
    				P[cnt] = P[cnt2];
    				P[cnt2] = tmp;
    				tmp2 = PNUM[cnt];
    				PNUM[cnt] = PNUM[cnt2];
    				PNUM[cnt2] = tmp2;
    			}
    		}
    	}

    	long M = N;
    	long youryo = 0;

    		for(int cnt = 0;cnt < 4; cnt++){
    			if(PNUM[cnt] == 0){
    				youryo = 25;
    				P[cnt] = P[cnt] / 800;
    			}
    			if(PNUM[cnt] == 1){
    				youryo = 50;
    				P[cnt] = P[cnt] / 400;
    			}
    			if(PNUM[cnt] == 2){
    				youryo = 100;
    				P[cnt] = P[cnt] /200;
    			}
    			if(PNUM[cnt] == 3){
    				youryo = 200;
    				P[cnt] = P[cnt] /100;
    			}

    			if(M >= (long)youryo){


    			sum = sum + (P[cnt] * (M / youryo));
    			M = (M / youryo);

    			if(M % youryo == 0){
    				break;
    			}
    			}


    	}

    	System.out.println((long)sum);

    }
}