import java.util.*;

class Main {
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      int     N    = Integer.parseInt(scan.next());

      int[] arr   = new int[N];
      int[] times = new int[N];

      for(int i = 0; i < N; i++){
          arr[i] = Integer.parseInt(scan.next());
          int n = 0;
          while(arr[i] % 2 == 0){
                arr[i] = arr[i] / 2;
                n++;
                }
          times[i] = n;
          }
      Arrays.sort(times);
      System.out.println(times[0]);
   }
}
