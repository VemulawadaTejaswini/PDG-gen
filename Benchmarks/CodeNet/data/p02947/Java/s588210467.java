import java.util.*;

public class Main {

    public static void printX(int n){

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力

        int N = sc.nextInt();

        String[] list = new String[N];

        long c = 0;

        for (int i = 0; i < N; i++){
            char[] chars = sc.next().toCharArray();
            Arrays.sort(chars);
            list[i] = new String(chars);
            for(int j = i - 1 ; j >= 0; j--){
                if(list[i].equals(list[j])){
                    c++;
                }
            }
        }


        System.out.println(c);

    }
}