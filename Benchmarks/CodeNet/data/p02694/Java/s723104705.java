import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        double a = (double)X / 100;
        
        double value = Math.log10(a) / Math.log10(1.01);
                
        System.out.println((int)value + 1);
        
    
    }
}