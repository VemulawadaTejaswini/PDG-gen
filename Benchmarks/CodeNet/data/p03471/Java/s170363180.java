import java.util.*;

class Main{
	public static void main(String []args){
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();//合計枚数
      	int Y = sc.nextInt();//合計金額
      
      for(int i = 0; i <= N; i++ ){//10000円の枚数
        	for(int x = 0; x <= N - i; x++){//5000円の枚数
              int z = N - i - x;//1000円の枚数
              int amount = i * 10000 + x * 5000 + z * 1000;
              
              if (amount == Y){
              	System.out.println(i + " " + x + " " + z);
                return;
              }
              
            }
      	}
      System.out.println("-1 -1 -1");
    }
}