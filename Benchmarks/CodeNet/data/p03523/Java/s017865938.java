import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] akibaArray = { "A", "K", "I", "H", "A", "B", "A", "R", "A" };

        List<String> strArray = new ArrayList<String>(Arrays.asList(str.split("")));

        boolean flag = true;
        int count = 0;

        for (int i = 0; i < akibaArray.length - 1; i++) {
            if (strArray.get(i).equals(akibaArray[i])) {
                continue;
            } else if (akibaArray[i].equals("A")) {
                strArray.add(i, "A");
            } else {
                flag = false;
                break;
            }
        }

        System.out.println(flag && strArray.size() <= akibaArray.length ? "YES" : "NO");
    }
}