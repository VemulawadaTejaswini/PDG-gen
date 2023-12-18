import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Map<String,Integer>p=new HashMap<>();
        p.put("SUN",7);
        p.put("MON",6);
        p.put("TUE",5);
        p.put("WED",4);
        p.put("THU",3);
        p.put("FRI",2);
        p.put("SAT",1);
        System.out.println(p.get(new Scanner(System.in).next()));
    }
}
