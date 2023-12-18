import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] array = sc.nextLine().split(" ");
        if (Integer.parseInt(array[0]) % Integer.parseInt(array[1]) == 0) {
        	System.out.println("0");
        } else {
        	System.out.println("1");  
        }  
    }
}