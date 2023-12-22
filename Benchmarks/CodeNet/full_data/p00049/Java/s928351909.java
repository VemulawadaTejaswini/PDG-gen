import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
 
class Main {
 
    public static void main(String[] args) {
 
        Scanner sc = null;
 
        try {
            sc = new Scanner(System.in);
            Map<String, Integer> bloodType = new HashMap<String, Integer>();
            while (sc.hasNextLine()) {
                // ??\???
                String[] str = sc.nextLine().split(",");
 
                // ?????¶???????¨????????\?????????°?????????
                int count = 1;
                if (bloodType.containsKey(str[1])) {
                    bloodType.put(str[1], count);
                }
                bloodType.put(str[1], bloodType.get(str[1])+count);
            }
            // ??????
                System.out.println(bloodType.get("A"));
                System.out.println(bloodType.get("B"));
                System.out.println(bloodType.get("AB"));
                System.out.println(bloodType.get("O"));
 
        } finally {
            sc.close();
        }
    }
}