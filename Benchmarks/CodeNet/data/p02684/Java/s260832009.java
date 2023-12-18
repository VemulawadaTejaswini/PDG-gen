import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long K = sc.nextLong();
        int[] A = new int[N+10];
        int[] countA = new int[N+10];
        int nowTown = 1;
        List<Integer> looptown = new ArrayList<Integer>();
        long ans;

        for(int i=0; i < N; i++){
            A[i] = sc.nextInt();
        }
        
        for(long i=1; i <= 600000; i++){
            countA[nowTown] += 1;
            if(countA[nowTown] == 2){
                looptown.add(nowTown);
            }
            if(countA[nowTown] ==3){
                break;
            }
            nowTown = A[nowTown-1];
        }

        int countone=0;
        for(int i=0; i < N; i++){
            if(i==1) continue;
            if(countA[i] == 1){
                countone++;
            }
        }

        ans =  ((K-countone)%looptown.size());

        System.out.println(looptown.get((int)(ans)));
        sc.close();
    }
}