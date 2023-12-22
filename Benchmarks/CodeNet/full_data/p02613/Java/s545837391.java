import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Map<String, Integer> s = new HashMap<>();
        for(int i=0; i<n; i++) {
            String tmp = sc.next();
            if(s.containsKey(tmp)) {
                s.put(tmp, s.get(tmp)+1);
            } else {
                s.put(tmp, 1);
            }
        }

        if(s.get("AC")!=null) {
            System.out.println("AC" + " x " + s.get("AC"));
        } else {
            System.out.println("AC" + " x " + "0");
        }
        if(s.get("WA")!=null) {
            System.out.println("WA" + " x " + s.get("WA"));
        } else {
            System.out.println("WA" + " x " + "0");
        }
        if(s.get("TLE")!=null) {
            System.out.println("TLE" + " x " + s.get("TLE"));
        } else {
            System.out.println("TLE" + " x " + "0");
        }
        if(s.get("RE")!=null) {
            System.out.println("RE" + " x " + s.get("RE"));
        } else {
            System.out.println("RE" + " x " + "0");
        }

    }
}
