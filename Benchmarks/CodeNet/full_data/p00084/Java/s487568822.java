import java.util.Scanner;
import java.util.ArrayList;
public class Main{
public static void main(String[] args) {
    try(Scanner sc = new Scanner(System.in)) {
        while(sc.hasNextLine()){
            String line=sc.nextLine();
            String[] tokens = line.split("[,. ]");
            ArrayList<String> list = new ArrayList<>();
            for(String t: tokens) {
                if(t.length() >= 3 && t.length() <= 6) {
                    list.add(t);
                }
            }
            System.out.println(String.join(" ", list.toArray(new String[0])));
        }
    }
}
}
