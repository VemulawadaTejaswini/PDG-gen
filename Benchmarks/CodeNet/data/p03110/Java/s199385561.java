import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double num = 0;
        double jpy = 0;
        double btc = 0;
        String kind = "";
        List<Double> number = new ArrayList<>();
        for(int i = 0;i < N;i++) {
        	num = sc.nextDouble();
        	if("JPY".equals(sc.next())) {
        		jpy += num;
        	}
        	else {
        		btc += num;
        	}
        }
        btc *= 380000;
        jpy += btc;
        System.out.println(jpy);
	}

}