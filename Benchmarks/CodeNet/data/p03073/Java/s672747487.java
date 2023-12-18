import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
//        long startTime = System.currentTimeMillis();
        Scanner scanner = new Scanner(System.in);

        String S = scanner.next();

        scanner.close();

        int count = 0;

        Pattern regex = Pattern.compile("(00|11)");


        while(true) {
            Matcher matcher = regex.matcher(S);

            if(matcher.find()){
                if(matcher.group().equals("00")){
                    S = S.replaceFirst("00","01");
                }else{
                    S = S.replaceFirst("11","10");
                }
                count++;
            }else{
                break;
            }
        }

        System.out.println(count);

//        System.out.println(System.currentTimeMillis() - startTime);
    }
}
