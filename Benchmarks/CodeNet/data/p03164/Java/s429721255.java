import java.util.Scanner;

class Main{
	
  private static long go(int[] weight, int[] value, int index, int W, long maxV) {
		
		if((index < weight.length) && (W >= weight[index])) { 
			maxV = Math.max(go(weight, value, index+1, W, maxV), go(weight, value, index+1, W-weight[index], maxV + value[index]));
		}
		return maxV;
	}
  
  public static void main(String... args){
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int W = sc.nextInt();

      int[] weight = new int[N] ;
      int[] value = new int[N] ;
      
      for(int i = 0; i< N; i++){
            weight[i] = sc.nextInt();
            value[i] = sc.nextInt();
      }
      System.out.println(go(weight, value, 0, W, 0));
      if(sc != null)
        sc.close();
  }
}