import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());
        int v = a*a*b;
        
        if(x < v/2.0){
            System.out.println(Math.toDegrees(Math.atan((double)(a*b*b)/(2*x))));
        }else{
            double tan = (double)(2.0*(v-x))/(a*a*a);
            System.out.println(Math.toDegrees(Math.atan(tan)));
        }
    }
    
}