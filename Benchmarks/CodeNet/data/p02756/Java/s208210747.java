import java.util.Scanner;

/**
 * @author yoshizaki
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        sb.append(scanner.next());
        int query = scanner.nextInt();
        scanner.nextLine();
        String[] querys = new String[query];
        for(int i = 0; i < query; i++) {
            querys[i] = scanner.nextLine();
        }
        for(String s : querys) {
            sb = doQuery(sb, s);
        }
        System.out.println(sb.toString());
    }
    public static StringBuilder doQuery(StringBuilder sb, String query) {
        if(query.equals("1")) return sb.reverse();
        String[] q = query.split(" ");
        if(q[1].equals("1")) sb.insert(0, q[2]);
        if(q[1].equals("2")) sb.append(q[2]);
        return sb;
    }
}