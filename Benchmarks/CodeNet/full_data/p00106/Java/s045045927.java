/*
 * Copyright Narushima Hironori. All rights reserved.
 */
import java.io.*;
 
/**
 * http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=0106
 */
public class Main {
     
    static class Shop {
         
        int price, volume, discountedPrice, discountPer;
         
        Shop(int volume, int price, double discount, int per) {
            this.volume = volume;
            this.price = price;
             
            discountedPrice = (int) (price * per - price * per * discount);
            discountPer = per;
        }
         
        int calcPrice(int count) {
            int total = 0;
            while(count >= discountPer) {
                total += discountedPrice;
                count -= discountPer;
            }
            return total + price * count;
        }
         
        int maxBuyCount(int buyVolume) {
            return buyVolume / volume;
        }
         
    }
 
    Shop[] shops = {
            new Shop(200, 380, 0.20, 5),
            new Shop(300, 550, 0.15, 4),
            new Shop(500, 850, 0.12, 3)
    };
     
    public int calc(int volume) {
        if(volume % 100 != 0) {
            throw new IllegalArgumentException();
        }
         
        int[] buyCounts = new int[shops.length + 1];
        buyCounts[shops.length] = Integer.MAX_VALUE;
        calc(buyCounts, 0, volume);
        return buyCounts[shops.length];
    }
 
    void calc(int[] count, int shopIndex, int buyVolume) {
        if(shops.length == shopIndex) {
            if(buyVolume == 0) {
                int total = 0;
                for (int i = 0; i < shops.length; i++) {
                    total += shops[i].calcPrice(count[i]);
                }
                if(count[shopIndex] > total) {
                    count[shopIndex] = total;
                }
            }
        } else {
            Shop shop = shops[shopIndex];
            int maxBuyCount = shop.maxBuyCount(buyVolume);
            for (int buyCount = 0; buyCount <= maxBuyCount; buyCount++) {
                count[shopIndex] = buyCount;
                int nextBuyVolume = buyVolume - shop.volume * buyCount;
                calc(count, shopIndex + 1, nextBuyVolume);
            }
        }
    }
 
    public static void main(String[] args) throws IOException {
        Main calculator = new Main();
         
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        for (String l; (l = r.readLine()).length() > 0;) {
            int volume = Integer.parseInt(l);
            if(volume == 0) {
                break;
            }
            System.out.println(calculator.calc(volume));
        }
    }
 
 
}