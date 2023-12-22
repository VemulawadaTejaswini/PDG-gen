
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
 
public class Main {    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String , Integer> map = new HashMap<>();
        map.put("AC" , 0);
        map.put("WA" , 0);
        map.put("TLE" , 0);
        map.put("RE" , 0);
        for(int i =0;i<n;i++){
            String s = sc.next();
            switch(s){
                case "AC":
                    map.replace("AC", map.get("AC") + 1 );
                    break;
                    case "WA":
                    map.replace("WA", map.get("WA") + 1 );
                    break;
                    case "TLE":
                    map.replace("TLE", map.get("TLE") + 1 );
                    break;
                    case "RE":
                    map.replace("RE", map.get("RE") + 1 );
                    break;
            }
        }
        System.out.println("AC x " + map.get("AC"));
        System.out.println("WA x " + map.get("WA"));
        System.out.println("TLE x " + map.get("TLE"));
        System.out.println("RE x " + map.get("RE"));
    }
}

