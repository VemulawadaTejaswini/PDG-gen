import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextLine()) {
            String[] array = scanner.nextLine().split(" ");
            int H = Integer.parseInt(array[0]);
            int W = Integer.parseInt(array[1]);
            String[] board = new String[H];

            for (int i = 0; i < H; ++i) {
                board[i] = scanner.nextLine();
            }
            for (int y = 0; y < H; ++y) {
                for (int x = 0; x < W; ++x) {
                    if (board[y].charAt(x) == '#') {
                        boolean notFound = true;
                        if (y - 1 >= 0 && board[y - 1].charAt(x) == '#') {
                            notFound = false;
                        } else if (y + 1 >= H && board[y + 1].charAt(x) == '#') {
                            notFound = false;
                        } else if (x - 1 >= 0 && board[y].charAt(x - 1) == '#') {
                            notFound = false;
                        } else if (x + 1 >= W && board[y].charAt(x + 1) == '#') {
                            notFound = false;
                        }
                        
                        if (notFound) {
                            System.out.println("No");
                            return;
                        }
                    }
                }
            }
            System.out.println("Yes");
        }
    }
}