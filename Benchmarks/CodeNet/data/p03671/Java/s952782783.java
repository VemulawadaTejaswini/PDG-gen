import java.util.Scanner;

public class Main {

    public static void main(String args[]){

    	Scanner scan = new Scanner(System.in);
    	
    	//ベルの値段
    	int a = Integer.parseInt(scan.next());
    	int b = Integer.parseInt(scan.next());
    	int c = Integer.parseInt(scan.next());
    	
    	//合計金額
    	int sum = a + b;
    	int sum2 = a + c;
    	int sum3 = b + c;
    	
    	//sumが最安の場合
    	if((sum <= sum2)&&(sum <= sum3)){
    		System.out.println(sum);
    	}
    	//sum2が最安の場合
    	else if((sum2 <= sum)&&(sum2 <= sum3)){
    		System.out.println(sum2);
    	}
    	//sum3が最安の場合
    	else{
    		System.out.println(sum3);
    	}
    }
}
