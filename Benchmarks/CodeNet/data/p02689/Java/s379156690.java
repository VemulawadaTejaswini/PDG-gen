import java.util.Scanner;
public class Main{
    public static void main(String[]args){
      Scanner scan = new Scanner(System.in);
//      scan = new Scanner("4 3\n" +
//              "1 2 3 4\n" +
//              "1 3\n" +
//              "2 3\n" +
//              "2 4");
//
//        scan = new Scanner("6 5\n" +
//                "8 6 9 1 2 1\n" +
//                "1 3\n" +
//                "4 2\n" +
//                "4 3\n" +
//                "4 6\n" +
//                "4 6");

      int N = scan.nextInt();
      int M = scan.nextInt();
      int []heights = new int[N];
      boolean[]peaks = new boolean[N];
      for(int i=0; i<N;i++){
          peaks[i]= true;
      }

      for(int i=0;i<N;i++){
          heights[i] = scan.nextInt();
      }

      for(int i=0;i<M;i++){
          int a = scan.nextInt()-1;
          int b = scan.nextInt()-1;

          if(heights[a] <= heights[b]){
              peaks[a] = false;
          }
          if(heights[b] <= heights[a]){
              peaks[b] = false;
          }
      }

      int count = 0;
        for(boolean b: peaks){
            if(b){
                count++;
            }
        }

        System.out.println(count);


    }
}