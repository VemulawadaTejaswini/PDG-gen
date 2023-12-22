import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner src = new Scanner(System.in);


        Map<String,Integer> map = new HashMap<String,Integer>();

        map.put("AC",0);
        map.put("WA",0);
        map.put("TLE",0);
        map.put("RE",0);
        int n = src.nextInt();

        src.nextLine();

        while(n-- >0){

            String res = src.nextLine();

            map.put(res,map.get(res)+1);

        }

        System.out.println("AC X "+map.get("AC"));

        System.out.println("WA X "+map.get("WA"));
        System.out.println("TLE X "+map.get("TLE"));
        System.out.println("RE X "+map.get("RE"));
    }
}