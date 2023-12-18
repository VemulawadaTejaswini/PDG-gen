import java.io.*;
import java.util.*;

class Main{
    public static void main(String args[])throws IOException{
      try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        //input
        String[] num  = br.readLine().split(" ");        
        int A = Integer.parseInt(num[0]);
        int B = Integer.parseInt(num[1]);
        
        //for algorithm
        long result = 1;
        int count_A = 0, count_B = 0;
        int max = 100000;
        int prime_max = (int)Math.sqrt(max);
        boolean[] table = new boolean[max+1];
        List<Integer> prime = new  ArrayList<>();

        Arrays.fill(table, true);

        table[0] = table[1] = false;

        for(int i = 2; i <= prime_max; i++){
          if(table[i]){
            prime.add(i);
            int j = i + i;
            while(j <= max){
              table[j] = false;
              j = j + i;
            }
          }
        }

        //System.out.println(prime);

        //algorithm
        for(int i = 0; i < prime.size(); i++){
          if(A < prime.get(i) && B < prime.get(i)){
            break;
          }

          //System.out.println("====================");
          //System.out.println(prime.get(i));

          count_A = count_B = 0;

          while( A%prime.get(i) == 0){
            //System.out.println(prime.get(i));
            A /= prime.get(i);
            count_A++;
          }
          
          while( B%prime.get(i) == 0){
            //System.out.println(prime.get(i));
            B /= prime.get(i);
            count_B++;
          }

          if(count_A != 0 || count_B != 0){
            result *= (int)Math.pow((double)prime.get(i), (double)Math.max(count_A, count_B));
            //System.out.println(prime.get(i));
            //System.out.println(result);
          }
        }
        
        System.out.println(result);
      }

    }
}