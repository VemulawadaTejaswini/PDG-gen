import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double sum =0;
        for(int a=0;a<N;a++){
            double x = sc.nextDouble();
            String u = sc.next();
            if(u.equals("JPY")==true) sum+=x;
            else sum+=x*380000;
        }
        System.out.println(sum);
    }
}
