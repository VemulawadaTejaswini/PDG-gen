import java.util.Scanner;

public class Main {

  
    public static void main(String[] args) {
        String x;
        Scanner n =new Scanner(System.in);
        x=n.next();
        if(x.equals("Sunny"))
            System.out.print("Cloudy");
        else if(x.equals("Cloudy"))
            System.out.print("Rainy");
        else if(x.equals("Rainy"))
            System.out.print("Sunny");
    }
    
}