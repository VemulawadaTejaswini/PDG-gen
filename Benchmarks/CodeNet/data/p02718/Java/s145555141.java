import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int itemCount = sc.nextInt();
        int pickupCount = sc.nextInt();
        List<Integer> itemList = new ArrayList<>();
        for(int i = 1; i <= itemCount ; i++){
            itemList.add(sc.nextInt());
        }

	    String result = execute(itemCount,pickupCount,itemList);
        System.out.println(result);
    }

    public static String execute(
            int itemCount,
            int pickupCount,
            List<Integer> itemList){

        int canPickupCount = 0;

        int allVote = itemList.stream()
                .mapToInt(Integer::intValue)
                .sum();
        int border = BigDecimal.valueOf(allVote)
                .divide(BigDecimal.valueOf(4 * pickupCount),0, RoundingMode.UP)
                .intValue();
        for(Integer item : itemList){
            if(item >= border) canPickupCount++;
            if(pickupCount == canPickupCount) return "Yes";
        }
        return "No";
    }
}
