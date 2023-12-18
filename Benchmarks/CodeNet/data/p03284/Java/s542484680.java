import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        if(0 == n%m){
            System.out.println("0");
        }else{
            System.out.println("1");
        }
    }

}