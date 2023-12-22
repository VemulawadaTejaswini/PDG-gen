import java.util.Scanner;
  public class Main{
    public static void(String[] args){
      Scanner scan = new Scanner();

      int n = scan.nextInt();
      int[] abc = new int[n];
      int min = 1000000;
      int max = -1000000;
      int sum = abc[n];

          for(int i = 0;i<n;i++){
             abc[i] = scan.nextInt();

             if(min>abc[i]){
                 min=abc[i];
             }

             if(max<abc[i]){
                 max=abc[i];

             }
          }
     System.out.println(min + " " + max + " " + sum);

    }