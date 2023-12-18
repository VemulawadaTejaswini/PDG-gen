
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() / 2;
        int[] aq = new int[100000];
        int[] bq = new int[100000];
        for (int i = 0;i < n * 2;++i){
            if(i % 2 == 1)++bq[sc.nextInt()];
            else ++aq[sc.nextInt()];
        }
        int ama = 0;
        int ai = 0;
        int bma = 0;
        int bi = 0;
        for (int i = 0;i < 100000;++i){
            int a = aq[i];
            if(ama < a){
                ama = a;
                ai = i;
            }
        }
        for(int i = 0;i < 100000;++i){
            int b = bq[i];
            if(bma < b){
                bma = b;
                bi = i;
            }
        }
        if(ai == bi)bma = 0;
        System.out.println(n * 2 - ama - bma);

    }


}



