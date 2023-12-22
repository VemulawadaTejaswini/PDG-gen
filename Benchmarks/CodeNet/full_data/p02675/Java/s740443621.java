import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        
        int onesPlace = N % 10;

        Integer[] honList = {2, 4, 5, 7, 9};
        Integer[] ponList = {0, 1, 6, 8};
        Integer[] bonList = {3};
        
        if (Arrays.asList(honList).contains(onesPlace)){
            System.out.println("hon");
        } else if (Arrays.asList(ponList).contains(onesPlace)) {
            System.out.println("pon");
        } else if (Arrays.asList(bonList).contains(onesPlace)) {
            System.out.println("bon");
        } 
        
    }
}