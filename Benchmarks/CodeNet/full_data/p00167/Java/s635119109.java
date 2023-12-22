import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextInt()){
            int n = sc.nextInt();
            int[] t = new int[n];

            for(int i = 0; i < n; i++){
                t[i] = sc.nextInt();
            }

            int cnt = 0;

            for(int i = 0; i < n - 1; i++){
                for(int j = 0; j < n - i - 1; j++){
                    if(t[j] > t[j + 1]){
                        cnt++;
                        t[j] ^= t[j + 1];
                        t[j + 1] ^= t[j];
                        t[j] ^= t[j + 1];
                    }
                }
            }

            System.out.println(cnt);
        }
    }
}