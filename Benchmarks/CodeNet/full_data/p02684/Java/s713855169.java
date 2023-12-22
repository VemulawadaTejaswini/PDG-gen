import java.util.*;

class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt(); //6
      long K = sc.nextLong();
      int[] a = new int[N+1];  //0~5
      int n = 1;
      int temp = 1;
      
      for(int i=1; i<N+1; i++){
        a[i] = sc.nextInt();
      }
     
      while(n <= K){
        temp = a[temp];
        n++;
      }
     
      System.out.println(temp);
   }
}
