import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Order> orders = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            Order order = new Order(i, sc.nextInt());
            orders.add(order);
        }

        List<Order> sorted = orders.stream()
            .sorted(Comparator.comparing(Order::getNumber))
            .collect(Collectors.toList());

        for (int i = 0; i < n; i++) {
            System.out.print(sorted.get(i).getOrder() + " ");
        }
    }

    static class Order {
        Integer order;
        Integer number;
        
        public Order(Integer order, Integer number) {
            this.order = order;
            this.number = number;
        }

        public Integer getOrder() {
            return order;
        }

        public Integer getNumber() {
            return number;
        }
    }
}