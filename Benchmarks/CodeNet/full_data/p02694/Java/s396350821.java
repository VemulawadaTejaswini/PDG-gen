import java.util.*;

public class Main {
    public static void main(String[] args) {
        Long x, y = (long)100;
        Long n = (long)0;
        Scanner sc = new Scanner(System.in);
        x = sc.nextLong();
        while (y < x){
            Long i = y / (long)100;
            n++;
            y += i;
            //System.out.println("kekka" + y);
        }
        System.out.println(n);
    }
}