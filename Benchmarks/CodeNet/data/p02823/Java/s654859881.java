import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n =sc.nextLong(),a=sc.nextLong(),b=sc.nextLong();
        if((a+b)%2==0){
            System.out.println((a+b)/2-a);
        } else {
            System.out.println(Math.min(a-1,n-b)+(b-a-1)/2);
        }
    }
}
