import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String strT = in.nextLine();
        String strP = in.nextLine();

        Pattern reg = Pattern.compile(strP);
        Matcher m = reg.matcher(strT);

        int count = 0;

        int index = 0;
        while(m.find(index)) {
            count++;
//            System.out.println("Match number "+count);
//            System.out.println("start(): "+m.start());
//            System.out.println("end(): "+m.end());

            index = m.start() + 1;

            System.out.println(m.start());
        }
    }
}

