import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      	
        // 行列の長さ
        long n = sc.nextLong();
      	long result=0;//条件を満たした
      	long nine=1;//9は含むが条件を満たしていない
      	long zero=1;//0は含むが条件を満たしていない
      	long non=8;//0,9を含まない(初期条件として長さが1の時を先に入れている)
          
      	for(int i=2;i<=n;i++){
          result=result*10+nine+zero;
          nine=nine*9+non;
          zero=zero*9+non;
          non=non*8;
          result=result%(long)(Math.pow(10,9)+7);
          nine=nine%(long)(Math.pow(10,9)+7);
          zero=zero%(long)(Math.pow(10,9)+7);
          non=non%(long)(Math.pow(10,9)+7);
         // System.out.println(result);
        }
		

      	System.out.println(result);

    }
}