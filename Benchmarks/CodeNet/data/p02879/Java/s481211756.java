import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a * b;
        if(sum >=1 && sum <=20){
            System.out.println(sum);
        }else{
            System.out.println("-1");
        }
    }
}