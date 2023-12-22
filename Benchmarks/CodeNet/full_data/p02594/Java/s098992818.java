import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int temp = sc.nextInt();
        System.out.println(temp >= 30 ? "Yes" : "No");
    }
}