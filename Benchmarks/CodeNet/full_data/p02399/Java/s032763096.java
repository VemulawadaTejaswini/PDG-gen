import java.util.Scanner;
class Main{
    public static void main(String[] args){
        
        int d,r;
        double f = 0;

        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        d = a / b;
        r = a % b;
        f = (double)a / b;
        
        
        System.out.println(d + " " + r + " " + (String.format("%.5f",f)));
    }
}

