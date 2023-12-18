import java.util.*;

public class Main {

    public static void main(String[] args) {
        q_2();
    }

    private static void q_1() {
        try(Scanner scan = new Scanner(System.in)) {
            String b = scan.next();

            switch (b) {
                case "A":
                    System.out.println("T");
                    break;
                case "T":
                    System.out.println("A");
                    break;
                case "C":
                    System.out.println("G");
                    break;
                case "G":
                    System.out.println("C");
                    break;
            }
        }
    }

    private static void q_2() {
        try(Scanner scan = new Scanner(System.in)) {
            String S = scan.next();

            List<Integer> cntList = new ArrayList<>();
            int cnt = 0;

            for(int i=0; i<S.length(); i++) {
                char b = S.charAt(i);

                switch (b) {
                    case 'A':
                        cnt ++;
                        break;
                    case 'T':
                        cnt ++;
                        break;
                    case 'C':
                        cnt ++;
                        break;
                    case 'G':
                        cnt ++;
                        break;
                    default:
                        cntList.add(cnt);
                        cnt = 0;
                }
            }
            Integer result = Collections.max(cntList);

            System.out.println(result);
        }
    }
}
