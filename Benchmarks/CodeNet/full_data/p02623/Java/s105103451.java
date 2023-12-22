import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int timeResult = 0;
    static int countA, countB;
    static long maxNum;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        long K = sc.nextLong();
        int[] timeTakenA = new int[N];
        int[] timeTakenB = new int[M];

        
        for (int i = 0; i <N; i++){
            timeTakenA[i] = sc.nextInt();
        }

        for (int i = 0; i <M; i++){
            timeTakenB[i] = sc.nextInt();
        }

        for(int i = 0; i < N; i++){
            if(timeResult + timeTakenA[i] > K) break;
            timeResult += (long)timeTakenA[i];
            countA++;
        }

        maxNum = countA;
        for (int i = 0; i <M; i++){
            while(timeResult + timeTakenB[i] > K){
                if(countA == 0) break;
                timeResult -= timeTakenA[countA - 1];
                countA--;
            }

            if(timeResult + timeTakenB[i] > K){
                break;
            }

            timeResult += timeTakenB[i];
            countB++;
            
            if(countA + countB >= maxNum){
                maxNum = countA + countB;
            }
        }
        
        System.out.println(maxNum);

    }


}