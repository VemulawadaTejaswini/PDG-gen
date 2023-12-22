import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
		String str = "hon";
        num = num%10;
		
		if (num == 3){
			str = "bon";
		}
		else if (num == 0 || num == 1 || num == 6 || num == 8){
			str = "pon";
		}
		 System.out.printf(str);
    }
}