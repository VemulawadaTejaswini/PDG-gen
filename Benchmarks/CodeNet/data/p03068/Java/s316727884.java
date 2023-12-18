import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            int n = sc.nextInt();
            StringBuffer sb = new StringBuffer(sc.next());
            int k = sc.nextInt();

            char ch = sb.charAt(k-1);

            for (int i = 0; i < sb.length(); i++) {
                if (sb.charAt(i) != ch)
                    sb.setCharAt(i, '*');
            }

            System.out.println(sb);

        }
    }
}