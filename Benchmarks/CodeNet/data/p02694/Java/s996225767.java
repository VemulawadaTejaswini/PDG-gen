import java.util.*;

class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long money = 100;
        long x = sc.nextLong();
        long n = 0;
        while(x>money){
            n++;
            money *= 1.01;
        }
        System.out.println(n);
    }
}
