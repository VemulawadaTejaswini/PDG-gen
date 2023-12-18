import java.util.*;

public class Main {

    public static void printX(int n){

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力

        int N = sc.nextInt();

        int[][] list = new int[N][];

        long c = 0;

        int i,j,k;

        for (i = 0; i < N; i++){
            char[] chars = sc.next().toCharArray();
            list[i] = new int[26];

            for(k = 0; k  < 10; k++){
                list[i][chars[k] - 'a']++;
                //System.out.print(chars[k] - 'a');
            }

            for(j = i - 1 ; j >= 0; j--){
                for(k = 0; k < 26; k++){
                    if(list[i][k] != list[j][k]){
                        c--;
                        break;
                    }
                }
                c++;
            }
        }


        System.out.println(c);

    }
}