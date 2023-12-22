import java.util.Scanner;

class Main{
    public static double mathS(int a,int b,int C){
        double Rad = Math.toRadians(C);
        double S = a * b * Math.sin(Rad) / 2;
        return S;
    }
    
    public static double mathL(int a,int b,int C){
        double Rad = Math.toRadians(C);
        double L = a + b + Math.sqrt(a*a + b*b - 2 * a * b * Math.cos(Rad));
        return L;
    }
    
    public static double mathB(int b , int C){
        double Rad = Math.toRadians(C);
        double B = b * Math.sin(Rad);
        return B;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int C = sc.nextInt();
        
        System.out.println(mathS(a,b,C));
        System.out.println(mathL(a,b,C));
        System.out.println(mathB(b,C));
        
    }
}
