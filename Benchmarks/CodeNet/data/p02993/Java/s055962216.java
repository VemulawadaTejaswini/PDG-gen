
import java.util.*;


public class Main {

    private static final int INF = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        boolean result = false;

        String[] strArray = str.split("");
        List<Integer> list = new ArrayList<Integer>();
        list.add(Integer.parseInt(strArray[0]));
        for (int tmp = 1; tmp < strArray.length ; tmp++) {
            list.add(Integer.parseInt(strArray[tmp]));
            int before = list.get(tmp - 1);
            int after = Integer.parseInt(strArray[tmp]);
            if(before == after){
                result = true;
                break;
            }
        }

        if(result){
            System.out.println("Bad");
        }else{
            System.out.println("Good");
        }

    }
}
