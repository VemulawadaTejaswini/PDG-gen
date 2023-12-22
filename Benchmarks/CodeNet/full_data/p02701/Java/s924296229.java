import java.util.*;
import java.util.stream.*;

public class Main {
    private static final boolean IS_TAKAHASHI_TURN = true;

    public static void main(String[] args) {
	    // write your code here
        Scanner sc = new Scanner(System.in);
        long giftCount = sc.nextLong();
        List<String> giftList = new ArrayList<>();
        for (int i = 0; i < giftCount; i++) {
            String gift = sc.next();
            if (!giftList.contains(gift)) {
                giftList.add(gift);
            }
        }
        System.out.println(giftList.size());
    }
}
