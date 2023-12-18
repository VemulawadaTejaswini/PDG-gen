import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        String a=sc.next();
        switch (a){
            case "A":
                System.out.println("T");
                break;
            case "T":
                System.out.println("A");
                break;
            case "C":
                System.out.println("G");
                break;
            case "G":
                System.out.println("C");
                break;
        }
    }
}
