import java.util.Scanner;
class Main{
	public static void main(String[] args){
    	Scanner console = new Scanner(System.in);
    	int N = console.nextInt();
      int M = console.nextInt();
      System.out.println(combination(N) + combination(M));
	}
	
	public static int combination(int num){
	   int comb = 0;
      int temp = 1;
      for(int i = num; i > num - 2; i--){
         temp *= i;
      }
      temp /= 2;
      if(temp != 0){
         comb = temp;
     	}
     	return comb;
	}
}