import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        int sum = 0;
        List<List<Integer>> w = new ArrayList<List<Integer>>(M+2);
        //指定よりも枠を一回り大きく取る
        for(int i = 0; i<=M+1 ; i++){
            List<Integer> h = new ArrayList<Integer>(N+2);
            w.add(h);
            for(int j = 0 ; j<= N+1 ; j++){
                w.get(i).add(1);
            }
        }

        /*for(int i = 0; i<=M+1 ; i++){
          for(int j = 0 ; j<= N+1 ; j++){
          System.out.print(w.get(i).get(j));
          }
          System.out.println();
        }
        */
        System.out.println();
        //指定の枠を0で埋める
        for(int i = 1; i<=M ; i++){
            for(int j = 1 ; j<= N ; j++){
                w.get(i).set(j,0);
            }
        }
        /*for(int i = 0; i<=M+1 ; i++){
          for(int j = 0 ; j<= N+1 ; j++){
          System.out.print(w.get(i).get(j));
          }
          System.out.println();
        }
        */
        for(int i = 1; i<=M ; i++){
            for(int j = 1 ; j<= N ; j++){
                int count = 0;
                if(w.get(i-1).get(j-1) == 0){
                    count++;
                }
                if(w.get(i-1).get(j) == 0){
                    count++;
                }
                if(w.get(i-1).get(j+1) == 0){
                    count++;
                }
                if(w.get(i).get(j-1) == 0){
                    count++;
                }
                if(w.get(i).get(j) == 0){
                    count++;
                }
                if(w.get(i).get(j+1) == 0){
                    count++;
                }
                if(w.get(i+1).get(j-1) == 0){
                    count++;
                }
                if(w.get(i+1).get(j) == 0){
                    count++;
                }
                if(w.get(i+1).get(j+1) == 0){
                    count++;
                }
                if(count % 2 == 1){
                    sum ++;
                }
            }
        }
        System.out.println(sum);
        //for(int i = 0; i<=M+1 ; i++){
        //    for(int j = 0 ; j<= N+1 ; j++){
        //        System.out.println(w.get(i).get(j));
        //    }
        //}

    }
}
