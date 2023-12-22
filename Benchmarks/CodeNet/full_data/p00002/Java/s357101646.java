import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        List<Integer> res = new ArrayList<Integer>();
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            String[] req = s.split(" ");
            res.add(String.valueOf(Integer.parseInt(req[0]) + Integer.parseInt(req[1])).length());
            if (s.length() == 0) { // ???????????????(????????????)?????´???
                break;
            }
            System.out.println(res);
        }

    }

}