import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 1段目の宝石数
		int n = sc.nextInt();

      	int min = 0;
      	int max = 0;
      	int minusNum = 0;
		// 2段目の数値
		for (int i=0; i < n; i++) {
          	int  num = sc.nextInt();
			if (num < 0) {
              minusNum++;
            }
          	int tmp = Math.abs(num);
          	if (min == 0 || tmp<min) {
              min = tmp;
            }
          	max += tmp;
 
        }
      	
      	if(minusNum % 2 != 0){
          max = max + (min * -2);
        }

		System.out.println(max);      

 	}
 
}