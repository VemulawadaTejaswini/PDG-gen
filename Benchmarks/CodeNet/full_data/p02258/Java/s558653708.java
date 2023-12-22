import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> priceList = new ArrayList<>();

        for (int i = 0; i < n; i ++){
            priceList.add(sc.nextInt());
        }

        int maximumProfit = -1000000000;
        int minimumPrice = priceList.get(0);

        for (int i =1; i < priceList.size(); i++){
            int price = priceList.get(i);
            maximumProfit = Math.max(maximumProfit, price - minimumPrice);
            minimumPrice = Math.min(minimumPrice, price);
        }

        System.out.println(maximumProfit);
    }

}
