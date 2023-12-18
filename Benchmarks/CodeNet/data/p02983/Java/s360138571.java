import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long l = sc.nextLong();
        long r = sc.nextLong();
        long min = Long.MAX_VALUE;
        long min2 = Long.MAX_VALUE;
        for(long i = l; i<=r; i++) {

            if(min > (i%2019)) {
               min2 = min;
               min = (i%2019);
            }else if(min2 > (i%2019)) {
                min2 = (i%2019);
            }
        }
        System.out.println(min*min2);
    }


}