import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int po=sc.nextInt();
        int po2=sc.nextInt();
        System.out.println(Math.max(Math.max(po+po-1,po+po2),po2+po2-1));
    }
}
