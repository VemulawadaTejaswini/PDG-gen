import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        boolean debug = false;
        if (debug != false) {
            return;
        }
        System.out.println(str);
    }

    public static void main(String[] args) {

        int  N;
        int[] pList;
        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextInt();
            pList = new int[N];
            for(int i =0 ; i < N;i++){
                pList[i] = sc.nextInt();
            }
        }

        int result = 0;
        for(int i = 0 ; i < N -2;i ++){
            if(pList[i] < pList[i+1] && pList[i+2] > pList[i+1]){
                result++;
            }else if(pList[i] > pList[i+1] && pList[i+2] < pList[i+1]){
                result++;
            }
        }
        System.out.println(result);

    }

}
