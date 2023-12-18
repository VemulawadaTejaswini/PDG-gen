import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double a = Double.parseDouble(sc.next());
        double b = Double.parseDouble(sc.next());
        double c = Double.parseDouble(sc.next());
        
        if((Math.sqrt(a) + Math.sqrt(b)) < Math.sqrt(c)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}