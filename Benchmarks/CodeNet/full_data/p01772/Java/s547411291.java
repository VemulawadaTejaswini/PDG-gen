import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)) {
            int num = scn.next().replaceAll("[^A|Z]", "").split("AZ").length - 1;
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < num; i++) {
                sb.append("AZ");
            }
            System.out.println(sb.length() > 0 ? sb : "-1");
        }
    }
}