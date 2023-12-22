// 標準入力から2次元配列
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int result=-1;
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
      if(K%2!=0){

        String str = "7";
		int seven = Integer.parseInt(str);
        
			for (int i = 1; i <= 10000000; i++){

			  if (seven%K==0){
                result=i;
			    break;
			  }
		        str = str + "7";
				seven = Integer.parseInt(str);
  
			}       
      }
        System.out.println(result);
    }
}