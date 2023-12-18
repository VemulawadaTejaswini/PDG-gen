import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        switch(sc.next()){
            case "A":
                System.out.println("T");
                break;
            case "T":
                System.out.println("A");
                break;
            case "C":
                System.out.println("G");
                break;
            default:
                System.out.println("C");
        }
    }
}