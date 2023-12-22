import java.io.*;
import java.util.*;
 
 
class Main{
      public static void main(String[] args) throws IOException{
       int n =0;
       int [] suuji;
       int narabi =0;
       int count =0;

         Scanner scanner = new Scanner(System.in);
         int n = scanner.nexrInt();
         int [] suuji = new int[n];

         for(int i=0; i<n; i++){
             suuji[i] = scanner.nextInt();

           }

          for(int j=0; j<suuji.length-1; j++){
            for(int k=n; k<suuji.length-1; k++){
                if(suuji[k] < suuji[k-1]){
                    int a = suuji[k];
                    int b = suuji[k-1];
                    suuji[k] = b;
                    suuji[k-1]= a;
                    count++;
                }
              }
           narabi = suuji[j];
           System,out.print(narbai+ " ");
           }
           System.out.println(count);
     }
  }
}
         