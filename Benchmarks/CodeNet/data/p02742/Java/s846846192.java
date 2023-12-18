
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Long h = sc.nextLong();
        Long w = sc.nextLong();
        if(h%2==0 || w %2 ==0){
            System.out.println(h*w/2);
        }else {
            System.out.println((h*w/2)+1);
        }
        
        
    }
}