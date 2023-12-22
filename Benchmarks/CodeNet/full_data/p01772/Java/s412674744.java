import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)) {
            int num = scn.next().replaceAll("[^AZ]", "").replaceAll("AZ", ".").replaceAll("[^.]", "").length();
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < num; i++) {
                sb.append("AZ");
            }
            System.out.println(sb.length() > 0 ? sb : "-1");
        }
    }
}