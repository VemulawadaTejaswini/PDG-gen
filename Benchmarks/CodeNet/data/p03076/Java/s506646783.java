import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> orderTimeList = new ArrayList<>();

        for (int i = 0; i < 5; i ++){
            orderTimeList.add(sc.nextInt());
        }

        int orderTimeSum = 0;
        int lastOrderSaveTime = 0;

        for (int time : orderTimeList){
            if (time % 10 == 0){
                orderTimeSum += time;
            }else{
                orderTimeSum += (time / 10 + 1) * 10;
                if (time % 10 < 10 - lastOrderSaveTime){
                    lastOrderSaveTime = 10 - time % 10;
                }
            }
        }

        System.out.println(orderTimeSum - lastOrderSaveTime);
    }

}