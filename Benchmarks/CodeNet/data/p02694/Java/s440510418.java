
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        Scanner sc = new Scanner(System.in);
        double k =sc.nextInt();
        double money=100;
        int cnt = 0;
        while(money<k){
        	cnt+=1;
        	money=Math.floor(money*1.01);
        }
   	System.out.println(cnt);
        

	}
}


