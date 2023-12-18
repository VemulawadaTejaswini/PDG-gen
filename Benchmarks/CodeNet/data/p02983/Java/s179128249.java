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
        long K = sc.nextInt();
        int[] A = new int[N];
        int[] countA = new int[N];
        int nowTown = 1
        List looptown = new ArrayList<>();
        long ans;

        for(int i=0; i < N; i++){
            A[i] = sc.nextInt();
        }
        
        for(long i=1; i <= K; i++){
            countA[nowTown]++;
            if(countA[nowTown] >= 2){
                looptown.add(nowTown);
            }
            if(countA[nowTown] ==3){
                break;
            }
            nowTown = A[nowTown];
        }

        ans =  ((K-(N-looptown.size()))%looptown.size());

        if(ans == 0){
            System.out.println(looptown.get(looptown.size()));
        }else{
            System.out.println(looptown.get((int)(ans)));
        }
        sc.close();
    }
}