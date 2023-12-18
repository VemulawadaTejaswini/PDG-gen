import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long x = sc.nextLong();
        int hosei = 0;
        if (a % x == 0){
         hosei = 1;
       }
        
       System.out.println(b/x-a/x+hosei);
    }
}
