import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer price = sc.nextInt();
        Integer change = 0;

        Integer count_bill = (price / 1000);
        change = (price - (count_bill * 1000)); 
        
        System.out.println(change);
    }
}