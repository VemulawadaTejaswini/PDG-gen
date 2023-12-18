package abc141;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    static Map<String, String> map = new HashMap<String, String>(){
        {
            put("Sunny","Cloudy");
            put("Cloudy","Rainy");
            put("Rainy","Sunny");
        }
    };
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        
        System.out.println(map.get(s));
    }

}
