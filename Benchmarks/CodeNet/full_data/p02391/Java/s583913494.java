import java.util.Scanner;

public class Main{ 
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
            Int a = scanner.nextInt();
            Int b = scanner.nextInt();
            if(a>b){
                System.out.println("a>b");
            }else if(a<b){
                System.out.println("a<b");
            }else if(a==b){
                System.out.println("a==b");
            }
        }
}
