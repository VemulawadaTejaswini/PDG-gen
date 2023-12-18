import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        int K = sc.nextInt();
        long sum=0;
        if(K==1) sum = sum1(N);
        else if(K==2){
            sum = sum2(N);
            String n = N.substring(1);
            sum+= sum1(n);
        }
        else if(K==3){
            sum = sum3(N);
            String N2 = N.substring(1);
            sum+=sum2(N2);
            String N3 = N2.substring(1);
            sum+=sum1(N3);
        }
        System.out.println(sum);
    }
    public static long sum1(String N){
        long sum =0;
        if (N.length() == 1) sum += Character.getNumericValue(N.charAt(0));
        else sum += Character.getNumericValue(N.charAt(0)) + 9 * (N.length() - 1);
        return sum;
    }
    public static long sum2(String N){
        long sum =(81*(N.length()-1)*(N.length()-2))/2+9*(Character.getNumericValue(N.charAt(0))-1)*(N.length()-1);
        return sum;
    }
    public static long sum3(String N){
        long a = N.length()-1;
        long b = N.length()-2;
        long c = N.length()-3;
        long sum = (729*a*b*c)/6+(81*(Character.getNumericValue(N.charAt(0))-1)*a*b)/2;
        return sum;
    }
}