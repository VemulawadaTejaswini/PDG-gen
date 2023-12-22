import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 配列
        int x = sc.nextInt();
        int y = sc.nextInt();

        if(x * 4 < y || x * 2 > y || y % 2 != 0) {
            System.out.println("No"); 
        } else {
            System.out.println("Yes");
        }
    }
}
