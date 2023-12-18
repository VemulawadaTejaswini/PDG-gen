import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] p = new int[N];

        for(int i=0; i<N; i++){
            p[i] = sc.nextInt();
        }

        int errorIndex1 = -1;
        int errorIndex2 = -1;

        boolean result = true;

        for(int i=0; i<N-1; i++){
            int tmp = p[i];
            if(tmp > p[i+1]){
                if(errorIndex1 == -1){
                    System.err.println("e1:" + i);
                    errorIndex1 = i;
                }else if(errorIndex2 == -1){
                    System.err.println("e2:" + (i+1));
                    errorIndex2 = i+1;
                }else{
                    result = false;
                }
            }
        }

        if(errorIndex1 != -1 && errorIndex2 != -1 && result){
            int tmp = p[errorIndex1];
            p[errorIndex1] = p[errorIndex2];
            p[errorIndex2] = tmp;

            for(int i=0; i<N-1; i++){
                if(p[i] > p[i+1]){
                    result = false;
                }
            }
        }

        System.out.println(result ? "YES" : "NO");

    }
}
