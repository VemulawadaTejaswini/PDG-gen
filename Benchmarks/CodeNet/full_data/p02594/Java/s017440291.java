import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
        int temperature = sc.nextInt();
        
        if(temperature >= 30) {
        	System.out.println("Yes");
        }else {
        	System.out.println("No");
        }
	}

}