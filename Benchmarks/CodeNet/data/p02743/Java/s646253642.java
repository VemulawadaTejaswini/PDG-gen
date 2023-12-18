import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        if((sqrt(a, 0, a/2+1) + sqrt(b, 0, b/2+1)) < sqrt(c, 0, c/2+1)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

    public static double sqrt(double n, double low, double high){
        double border = (low + high) / 2.0;
        if(Math.abs(n-Math.pow(border,2)) <= Math.pow(10,-5)){
            return border;
        }else{
            if(n < Math.pow(border,2)){
                return sqrt(n, low, border);
            }else{
                return sqrt(n, border, high);
            }
        }
    }
}

