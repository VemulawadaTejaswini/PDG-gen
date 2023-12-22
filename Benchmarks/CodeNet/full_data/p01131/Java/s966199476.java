import java.util.*;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    private static final String[][] TABLE = {
        {},
        {".", ",", "!", "?", " "},
        {"a", "b", "c"},
        {"d", "e", "f"},
        {"g", "h", "i"},
        {"j", "k", "l"},
        {"m", "n", "o"},
        {"p", "q", "r", "s"},
        {"t", "u", "v"},
        {"w", "x", "y", "z"}
    };
    
    public static void main(String[] args) {
        scn.nextLine();
        while(scn.hasNextLine()) {
            Scanner reader = new Scanner(scn.nextLine());
            reader.useDelimiter("0+");
            StringBuilder sb = new StringBuilder();
            while(reader.hasNext()) {
                String tmp = reader.next();
                int y = Integer.parseInt(tmp.substring(0, 1));
                int x = (tmp.length() - 1) % TABLE[y].length;
                sb.append(TABLE[y][x]);
            }
            System.out.println(sb);
        }
    }
}