
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean cantReducedAnyMore = false;
        int previous = sc.nextInt();
        int current ;
        String result = "Yes";
        while (sc.hasNext()){
            current = sc.nextInt();
            int diff = current - previous;
            if(diff > 0){
                cantReducedAnyMore = false;
            } else if(diff == -1){
                if(cantReducedAnyMore){
                    result = "No";
                    break;
                }else {
                    cantReducedAnyMore = true;
                }
            }else if(diff < -1){
                result = "No";
                break;
            }
            previous = current;
        }
        System.out.println(result);
    }

}
