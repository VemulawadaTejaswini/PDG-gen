import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int count = 0;

        while(str.contains("ABC")){
            str = str.replaceFirst("ABC", "BCA");
            count++;
        }
        System.out.println(count);
    }
}