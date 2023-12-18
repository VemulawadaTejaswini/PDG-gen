import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n =sc.nextLong(),a=sc.nextLong(),b=sc.nextLong();
        if((a+b)%2==0){
            long tmp = Math.min(Math.max(a-1,b-1),Math.max(n-a,n-b));
            System.out.println(Math.min(tmp,(a+b)/2-a));
        } else {
            System.out.println(Math.min(Math.max(a-1,b-1),Math.max(n-a,n-b)));
        }
    }
}