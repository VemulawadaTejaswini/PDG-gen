
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        long value = scanner.nextLong();
        long count = scanner.nextLong();
        scanner.nextLine();
        String anti = scanner.nextLine();
        boolean isPrejudice = false;
        List<String> antiNumber = new ArrayList<String>();
        for(String s : anti.split(" ")) {
            antiNumber.add(s);
        }
        Pattern prejudice = Pattern.compile("^["+anti.replaceAll(" ", "") +"]+$");
        
        anti.split("");
        int prejudiceCount = 0;
        int i = 0;
        while(!isPrejudice) {
            value = value * ++i;
            Matcher m = prejudice.matcher(String.valueOf(value));
            if (m.find()) {
                continue;
            } else {
                break;
            }
        }
        System.out.println(value);
    }
}