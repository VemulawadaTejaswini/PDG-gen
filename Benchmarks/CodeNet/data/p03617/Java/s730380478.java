import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	double Q = in.nextDouble() * 8;
    	double H = in.nextDouble() * 4;
    	double S = in.nextDouble() * 2;
    	double D = in.nextDouble();

    	double N = in.nextDouble();

    	double P[] = new double[4];
    	int PNUM[] = new int[4];//Pの添え字を格納する
    	for(int cnt = 0;cnt < 4; cnt++){
    		PNUM[cnt] = cnt;
    	}

    	double sum = 0;

    	P[0] = Q;
    	P[1] = H;
    	P[2] = S;
    	P[3] = D;

    	//小さい順にソート
    	for(int cnt = 0; cnt < 4; cnt++){
    		double tmp;
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

    	double M = N;
    	double youryo = 0.0;

    		for(int cnt = 0;cnt < 4; cnt++){
    			if(PNUM[cnt] == 0){
    				youryo = 0.25;
    				P[cnt] = P[cnt] / 8;
    			}
    			if(PNUM[cnt] == 1){
    				youryo = 0.5;
    				P[cnt] = P[cnt] / 4;
    			}
    			if(PNUM[cnt] == 2){
    				youryo = 1.0;
    				P[cnt] = P[cnt] / 2;
    			}
    			if(PNUM[cnt] == 3){
    				youryo = 2.0;
    			}

    			sum = sum + (P[cnt] * Math.floor(M / youryo));
    			M = Math.floor(M / youryo);

    			if(M % youryo == 0){
    				break;
    			}


    	}
    		if(sum == 0){
    			sum = 1;
    		}

    	System.out.println((long)sum);

    }
}