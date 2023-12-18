import java.util.*;

public class Main {

    public static class Shop implements Comparable<Shop> {
        long price;
        long sum;

        @Override
        public int compareTo(Shop shop) {
            return (int)(this.price - shop.price);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String in[];
        int row, idx;
        long m, ret;

        in = scanner.nextLine().split(" ");
        row = Integer.parseInt(in[0]);
        m = Integer.parseInt(in[1]);

        ArrayList<Shop> list = new ArrayList<>();
        for (int i = 0; i < row; i++) {
            in = scanner.nextLine().split(" ");
            Shop shop = new Drink.Shop();
            shop.price = Integer.parseInt(in[0]);
            shop.sum = Integer.parseInt(in[1]);
            list.add(shop);
        }

        Collections.sort(list);
        ret = 0;
        for (int i = 0; i < row; i++) {
            Shop shop = list.get(i);
            if (m > shop.sum) {
                ret += shop.price * shop.sum;
                m -= shop.sum;
            } else {
                ret += shop.price * m;
                break;
            }
        }

        System.out.println(ret);
    }
}