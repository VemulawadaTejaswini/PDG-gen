import java.util.*;

public class Main {

    public static void printX(int n){

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力

        int N = sc.nextInt();

        char[][] list = new char[N][];

        for (int i = 0; i < N; i++){
            list[i] = sc.next().toCharArray();
            Arrays.sort(list[i]);

        }

        boolean f = false;
        int c = 0;

        for(int i = 0; i < N; i++){
            for(int j = i + 1; j < N; j++){
                if(list[i].length != list[j].length) continue;
                f = true;
                for(int k = 0; k < list[i].length; k++){

                    if(list[i][k] != list[j][k] ){
                        f = false;
                        break;
                    }

                    if(!f ){
                        break;
                    }
                }
                if(f){
                    c++;
                }
            }
        }

        System.out.println(c);





    }
}