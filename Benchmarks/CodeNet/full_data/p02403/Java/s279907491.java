import java.util.Scanner;
 
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (in.hasNext()) {
            int lenH = in.nextInt();
            int lenW = in.nextInt();
 
            if (lenH == 0) {
                break;
            }
             
            String line = repeat('#', lenW);
            for (int i = 0; i < lenH; i++) {
                sb.append(line).append("\n");
            }
             
            sb.append("\n");
        }
        System.out.print(sb.toString());
    }
 
    private static String repeat(char c, int len) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            sb.append(c);
        }
        return sb.toString();
    }
}