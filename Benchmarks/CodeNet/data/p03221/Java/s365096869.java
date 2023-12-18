import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    static int N;
    static int M;
    static int [][] city;
    static String [] soultion;
    public static void main(String args[]) throws Exception {

       
        Scanner sc = new Scanner(System.in);
        N= sc.nextInt();
        M= sc.nextInt();

        city = new int[M][N];
        soultion= new String[M];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < 2; j++) {
                city[i][j] = sc.nextInt();
            }
        }
        for (int k = 1; k <= N; k++) {
            for (int i = 1; i <= 2; i++) {
                List<Integer> list = new ArrayList<>();
                for (int j = 0; j <M; j++) {

                        if (city[j][0] == k){
                            list.add(city[j][1]);
                        }
                 }
                sort(k,list);
             }

        }
        for (int i = 0; i < soultion.length; i++) {
            System.out.println(soultion[i]);
        }
    }

    public static void sort(int n,List<Integer> list){

        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            String str = String.format("%06d", n) + String.format("%06d",(i+1));
            for (int k = 0; k < 2; k++) {
                for (int j = 0; j < M; j++) {
                    if (city[j][k] == list.get(i)){

                        soultion[j]=str;
                    }
                }
            }
        }

    }
}
