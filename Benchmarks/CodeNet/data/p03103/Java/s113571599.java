import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        
        int shopCount = 4;
        int needDrinkCount = 30;
        
        long[][] shopDatas = new long[shopCount][2];
        for (int i = 0; i < shopCount; i++) {
            long price = 10;
            long maxBuyCount = 10;
            shopDatas[i][0] = price;
            shopDatas[i][1] = maxBuyCount;
        }
        
        Arrays.sort(shopDatas, (price, maxBuyCount)->Long.compare(price[0], maxBuyCount[0]));
        
        long needMoney = 0;
        
        for (int i = 0; i < shopCount; i++) {
            long price = shopDatas[i][0];
            long maxBuyCount = shopDatas[i][1];
            if (maxBuyCount <= needDrinkCount) {
                needMoney += price * maxBuyCount;
                needDrinkCount -= maxBuyCount;
            } else {
                needMoney += price * needDrinkCount;
                needDrinkCount -= needDrinkCount;
            }
            
            if (needDrinkCount == 0) break;
        }
        
        System.out.println(needMoney);
    }
}