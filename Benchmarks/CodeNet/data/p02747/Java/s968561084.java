import java.util.Scanner;

public class Main {
    static Scanner sc  = new Scanner(System.in);

    public static void main(String[] args) {
        String s = sc.next();
        String[] arr = s.split("hi");
        
        if(arr.length>=1){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}