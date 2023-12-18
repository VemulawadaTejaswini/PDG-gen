import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str=sc.nextLine();
            boolean find=false;
            outer:
            for (int i=0;i<str.length();i++) {
                for (int j=i+2;j<=str.length();j++) {
                        String ts = str.substring(i, j);
                        char ch='0';
                        int count=0;
                        for (char c:ts.toCharArray()) {
                            if (c == ch) {
                                count++;
                            } else if (count == 0) {
                                ch = c;
                                count = 1;
                            } else {
                                count--;
                            }
                        }
                        if (count>ts.length()/2) {
                            i++;
                            System.out.println(i + " " + j);
                            find = true;
                            break outer;
                        }
                }
            }
            if (!find)
            System.out.println(" -1 -1");
        }
    }
}