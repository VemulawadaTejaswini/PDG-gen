import java.util.*;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    private static boolean door = false;
    private static ArrayList<String> ids;
    
    public static void main(String[] args) {
        ids = entryId(scn.nextInt());
        useId(scn.nextInt());
    }
    
    public static ArrayList<String> entryId(int n) {
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            list.add(scn.next());
        }
        return list;
    }
    
    public static void useId(int m) {
        for(int i = 0; i < m; i++) {
            StringBuilder sb = new StringBuilder();
            String id = scn.next();
            if(ids.contains(id)) {
                if(door) {
                    sb.append("Closed by ");
                } else {
                    sb.append("Opened by ");
                }
                door = !door;
            } else {
                sb.append("Unknown ");
            }
            sb.append(id);
            System.out.println(sb);
        }
    }
}