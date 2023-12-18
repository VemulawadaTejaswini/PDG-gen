import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long K = sc.nextInt();
        long A = sc.nextInt();
        long B = sc.nextInt();
        long[] sunuke_has = new long[]{1, 0};
        
        if (A < B-1){
            for (int i=0; i<K ; i++){
                if(sunuke_has[1] == 0){
                    if(sunuke_has[0] < A){
                        sunuke_has[0] += 1;
                    } else {
                        if(i!= K-1){
                            sunuke_has[0]-=A;
                            sunuke_has[1] +=1;
                        } else {
                            sunuke_has[0] +=1;
                        }
                    }
                } else {
                    sunuke_has[1] = 0;
                    sunuke_has[0] += B;
                }
            }
        } else {
            for (int i=0; i<K;i++){
                sunuke_has[0] += 1;
            }
        }
        System.out.println(sunuke_has[0]);
    }
}
