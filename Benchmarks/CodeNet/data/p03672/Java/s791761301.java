import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(execute(sc.nextLine()));

    }

    public static int execute(String base) {

        EvenString evenString = new EvenString(base);
        do{
            evenString.cut();
        }while (!evenString.isEvenString());

        return evenString.length();
    }

    public static List<String> splitByLength(String s, int length) {
        List<String> list = new ArrayList<>();
        if (s != null && s.isEmpty()) {
            Matcher m = Pattern.compile("[\\s\\S]{1," + length + "}").matcher(s);
            while (m.find()) {
                list.add(m.group());
            }
        }
        return list;
    }

    private static class EvenString {
        String base;
        String first;
        String second;
        public EvenString(String base){
            this.split(base);
        }

        private void split(String base){
            this.base = base;
            int length = base.length() / 2;
            List<String> separated = splitByLength(base,length);
            this.first = separated.get(0);
            this.second = separated.get(1);
        }

        public boolean isEvenString(){
            return first.equals(second);
        }

        public int length(){
            return base.length();
        }

        public void cut() {
            String newBase = base.substring(0,base.length()-2);
            this.split(newBase);
        }
    }
}
