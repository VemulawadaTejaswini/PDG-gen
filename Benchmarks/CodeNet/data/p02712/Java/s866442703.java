import java.util.Scanner;

public class Main { //クラス名はMain
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
      int N = in.nextInt();
    
      int[] scores;
      scores = new int[N+1];
       for(int i = 1; i <= N; ++i){
            if(i % 3 == 0 && i % 5 == 0){
              scores[i] = 0;
              
            }else if(i % 3 == 0){
              scores[i] = 0;
             
            }else if(i % 5 == 0){
              scores[i] = 0;
             
            }else{
              scores[i] = i ;
            
            }
        }
      int sum = 0;
        for( int j=0; j<scores.length; j++ ) {
            sum += scores[j];
        }
        System.out.println(sum);
    }
}