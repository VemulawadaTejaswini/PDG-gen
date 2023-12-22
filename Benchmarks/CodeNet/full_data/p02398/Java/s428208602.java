import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] lines = sc.nextLine().split(" ");
        int num1 = Integer.parseInt(lines[0]);
        int num2 = Integer.parseInt(lines[1]);
        int num3 = Integer.parseInt(lines[2]);
        
        int count = 0;
        
        for(int i = num1; i <= num2;i++) {
        	if(num3 % i == 0) {
        		count++;
        	}
        }
        
        System.out.println(count);

    }
}