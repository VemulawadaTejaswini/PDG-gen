import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arrH = new int[N];
        for(int i = 0; i < N; i++) {
            arrH[i] = sc.nextInt();
        }

        int tmpA = 0;
        int tmpB = 0;
        boolean[] arrB = new boolean[N];
        for(int j = 0; j < M; j++) {
            tmpA = sc.nextInt() - 1;
            tmpB = sc.nextInt() - 1;
            if(arrH[tmpA] > arrH[tmpB]) {
                if(arrB[tmpB] != true) {                
                    arrB[tmpA] = false;
                }
                arrB[tmpB] = true;
            } else if(arrH[tmpA] < arrH[tmpB]) {
                arrB[tmpA] = true;
                if(arrB[tmpA] != true) {
                    arrB[tmpB] = false;
                }
            } else {
                arrB[tmpA] = true;
                arrB[tmpB] = true;
            }
        }
        int cnt = 0;
        for(int k = 0; k < N; k++) {
            System.out.println(arrB[k]);
            if(arrB[k] == false) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
