import java.util.*;

public class Main {
    public static void main(String[] args)   {
        
        Scanner sc = new Scanner(System.in);
        
        double res = 0;
        
        int line = 1;
        
        while(sc.hasNextLine()){
            String input = sc.nextLine();

            if(line != 1){
                if(input.contains("BTC")){
                    double btc = Double.parseDouble(input.replace(" BTC", ""));
                    
                    res+=btc*380000.0d;
                }else{
                    double jpy = Double.parseDouble(input.replace(" JPY", ""));
                    
                    res+=jpy;
                }
            }
            
            line++;
        }
        
        System.out.println(res);
        sc.close();
    }
}