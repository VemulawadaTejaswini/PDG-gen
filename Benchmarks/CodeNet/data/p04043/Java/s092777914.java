import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
        int a = 0;
        int count = 0;
      
        for(int i = 0;i < 3;i++){
          a = sc.nextInt();
       	    if(a == 7){
              count += 1;
        	}else if(a == 5){
              count += 10;
            }
        }
        if(count == 21){
        	System.out.println("YES");
        }else{
          	System.out.println("NO");
        }
    }
}