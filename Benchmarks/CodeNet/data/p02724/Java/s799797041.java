import java.util.*;

class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Long x = sc.nextLong();
        Long tmp = x/500;
        Long uresi = tmp*1000;
        x -= 500*tmp;
        tmp = x/5;
        uresi += tmp*5;
        x -= 5*tmp;
        System.out.println(uresi);
    }
}
