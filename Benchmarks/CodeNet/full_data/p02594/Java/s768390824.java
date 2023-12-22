import java.util.*;

public class HelloWorld {

    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(A());
    }

    public static String A() {
        int input = sc.nextInt();
        if(input >= 30){
            return "Yes";
        }
        else{
            return "No";
        }
    }
}
