import java.io.*;
import java.util.PriorityQueue;

class Shop implements Comparable<Shop> {
    long price;
    int number;

    public Shop(long price, int number) {
        this.price = price;
        this.number = number;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public long getPrice() {
        return price;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public int compareTo(Shop shop) {
        if (this.getPrice() > shop.getPrice()) {
            return 1;
        } else if (this.getPrice() < shop.getPrice()) {
            return -1;
        } else {
            return 0;
        }
    }
}


public class Main {

    private static int inputNum = 0;
    private static int drinkNeed = 0;

    private static long solver(Shop[] shop) {

        PriorityQueue<Shop> pq = new PriorityQueue<>();
        for (int i = 0; i < inputNum; i++) {
            pq.add(shop[i]);
        }

        int drinkNum = 0;
        long cost = 0;
        while (pq.size() != 0) {
            Shop s = pq.remove();
            if(drinkNum +s.getNumber() >= drinkNeed){

                return cost + (s.getPrice()* (drinkNeed - drinkNum));
            }else {
                drinkNum += s.getNumber();
                cost += s.getPrice() * s.getNumber();
            }
        }

        return 0;

    }


    public static void main(String[] args) {

        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);

        try {
            String[] inputArray = br.readLine().split(" ");
            inputNum = Integer.parseInt(inputArray[0]);
            drinkNeed = Integer.parseInt(inputArray[1]);
        } catch (Exception e) {
            e.printStackTrace();
        }


        Shop[] shop = new Shop[inputNum];
        try {
            for (int i = 0; i < inputNum; i++) {
                String[] inputArray = br.readLine().split(" ");
                shop[i] = new Shop(Integer.parseInt(inputArray[0]), Integer.parseInt(inputArray[1]));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(solver(shop));

    }
}