import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 値の取得
        int numOfTimes = sc.nextInt();


        int target = 0;	// 判定に使用する数値
        // +1した数と比較する
        while (numOfTimes > 0) {

        	target++;
        	double x = (double)target / (double)getSn(target);
        	double y = (double)(target+1) / (double)getSn(target+1);
        	if (x <= y) {
        		System.out.println(target);
        		numOfTimes--;
        	}
        }
    }

    // S(n)を求めるメソッド
    public static int getSn(int target) {

    	String strNum = String.valueOf(target);
    	String[] arr = strNum.split("");
        int sum = 0;
        for (String item : arr) {
        	sum += Integer.parseInt(item);
        }

        return sum;
    }
}