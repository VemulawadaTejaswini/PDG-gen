import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int X = sc.nextInt();
        int money=100;
        
        for(int i=1;i<100000000000000000;i++){
        money=money*1.01;
        i=i+1;
        if(money>=X){
        break;
        }
        }
		
		
	}
}