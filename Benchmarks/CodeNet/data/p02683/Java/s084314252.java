import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int x = scanner.nextInt();

        List<Book> books = new ArrayList<>();
        HashMap<Integer, Integer> totalScores = new HashMap<>();
        int totalPrice = 0;

        for (int i = 0; i < n; i++) {
            int price = scanner.nextInt();
            totalPrice = totalPrice + price;
            Book book = new Book(i, price);
            books.add(book);

            for (int j = 0; j < m; j++) {
                int score = scanner.nextInt();
                book.addScore(score);

                totalScores.put(j, totalScores.getOrDefault(j, 0) + score);
            }
        }

        if (!isClear(totalScores, x)) {
            System.out.println("-1");
            System.exit(0);
        }

        int sum = calc(books, totalPrice, totalScores, x, new HashSet<>());
        System.out.println(sum);

    }

    private static int calc(List<Book> books, int totalPrice, HashMap<Integer, Integer> totalScores, int x, HashSet<Integer> proceed) {
        int min = totalPrice;
        HashMap<Integer, Integer> calcedMinPrices = new HashMap<>();
        HashMap<Integer, HashMap<Integer, Integer>> calcedMinPricesMap = new HashMap<>();
        for (Book book : books) {
            if (proceed.contains(book.index)) {
                continue;
            }
            int tmp = totalPrice - book.price;
            HashMap<Integer, Integer> calcedPrices = (HashMap<Integer, Integer>) totalScores.clone();
            for (int i = 0; i < book.scores.size(); i++) {
                calcedPrices.put(i, calcedPrices.get(i) - book.scores.get(i));
            }

            if (isClear(calcedPrices, x)) {
                calcedMinPricesMap.put(book.index, calcedPrices);
                calcedMinPrices.put(book.index, tmp);
            } else {
                proceed.add(book.index);
            }
        }

        if (isAllProceed(proceed, books)) {
            return min;
        } else {
            int submin = totalPrice;
            for(Book book : books){
                if(proceed.contains(book.index)){
                    continue;
                }
                HashSet<Integer> copiedProceed = (HashSet<Integer>) proceed.clone();
                copiedProceed.add(book.index);
                int tmp = calc(books, calcedMinPrices.get(book.index), calcedMinPricesMap.get(book.index), x , copiedProceed);
                if(submin > tmp){
                    submin = tmp;
                }
            }
            return submin;
        }
    }

    static boolean isAllProceed(Set<Integer> proceed, List<Book> books) {
        return proceed.size() == books.size();
    }


    static boolean isClear(Map<Integer, Integer> totalScores, int x) {
        for (Integer value : totalScores.values()) {
            if (value < x) {
                return false;
            }
        }
        return true;
    }

    static class Book {
        int index;
        int price;
        List<Integer> scores;

        public Book(int index, int price) {
            this.index = index;
            this.price = price;
            this.scores = new ArrayList<>();
        }

        public void addScore(int score) {
            this.scores.add(score);
        }

    }
}