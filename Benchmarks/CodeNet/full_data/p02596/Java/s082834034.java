import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int K = scan.nextInt();

        if(0==7 % K){
            System.out.println("1");
        }else if(0==77 % K){
            System.out.println("2");
        }else if(0==777 % K){
            System.out.println("3");
        }else if(0==7777 % K){
            System.out.println("4");
        }else if(0==77777 % K){
            System.out.println("5");
        }else if(0==777777 % K){
            System.out.println("6");
        }else {
            System.out.println("-1");
        }
    }
}
