import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String s1 = "Sunny";
        String s2 = "Cloudy";
        String s3 = "Rainy";
        
        if(s.equals(s1))System.out.println("Cloudy");
        else if(s.equals(s2))System.out.println("Rainy");
        else if(s.equals(s3)) System.out.println("Sunny");
        
        
        
    }
}
