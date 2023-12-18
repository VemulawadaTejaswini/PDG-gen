import java.util.Scanner;
class Main{
	public static void main(String[] args){
    	Scanner console = new Scanner(System.in);
    	int N = console.nextInt();
      int M = console.nextInt();
      
      int[] arr = new int[N];
      for(int i = 0; i < N; i++){
         arr[i] = console.nextInt();
      }
      int count = 0;
      int sum = 0;
      for(int num : arr){
         sum += num;
      }
      double min = sum / (4.0 * M);
      for(int num : arr){
         if((double)num >= min){
            count++;
         }
      }
      if(count >= M){
         System.out.println("Yes");
      }else{
         System.out.println("No");
      }
   }
	
}