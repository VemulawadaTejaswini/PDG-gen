import java.util.*;

class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int A = sc.nextInt();  //  1
      int B = sc.nextInt();  //  0
      int C = sc.nextInt();  // -1
      int K = sc.nextInt();  // 選ぶ枚数
      int max = -100;
      
      for (int i =0; i <= A ; i++){
      	for (int j = 0; j <=  K - i; j++){
          if ( B >= j){
        	//Cの枚数  K - i - j
           if ( C >= (K - i - j)){
           	if ( max < (1*i + 0*j - 1*(K - i - j)) )
              max = 1*i + 0*j - 1*(K - i - j);
              //System.out.println(i + " " + j + " " + (K - i-j));
           	}
          }
        }
      }
      System.out.println(max);
    }
}