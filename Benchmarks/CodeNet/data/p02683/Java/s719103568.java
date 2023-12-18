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

        int sum = calc(books, totalPrice, totalScores, x);
        System.out.println(sum);

    }

    private static int calc(List<Book> books, int totalPrice, HashMap<Integer, Integer> totalScores, int x) {
        int min = totalPrice;
        HashMap<Integer, Integer> calcedMinPrices = new HashMap<>();
        Book minBook = null;
        for (Book book : books) {
            if (book.required) {
                continue;
            }
            int tmp = totalPrice - book.price;
            HashMap<Integer, Integer> calcedPrices = (HashMap<Integer, Integer>) totalScores.clone();
            for (int i = 0; i < book.scores.size(); i++) {
                calcedPrices.put(i, calcedPrices.get(i) - book.scores.get(i));
            }

            if (isClear(calcedPrices, x)) {
                if (min > tmp) {
                    min = tmp;
                    minBook = book;
                    calcedMinPrices = calcedPrices;
                }
            } else {
                book.required = true;
            }
        }
        if (isAllRequired(books)) {
            return min;
        } else {
            if (minBook != null) {
                minBook.required = true;
            }
            return calc(books, min, calcedMinPrices, x);
        }
    }

    static boolean isAllRequired(List<Book> books) {
        for (Book book : books) {
            if (!book.required) {
                return false;
            }
        }
        return true;
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
        boolean required = false;

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