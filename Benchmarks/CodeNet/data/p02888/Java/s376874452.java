import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer N = Integer.parseInt(scanner.next());
        List<Integer> L = new ArrayList<>();
        
        for(int i = 0; i < N; i++) {
            L.add(Integer.parseInt(scanner.next()));
        }

        Integer count = 0;

        for(int i = 0; i < N; i++) {
            for(int j = i + 1; j < N; j++) {
                for(int k = j + 1; k < N; k++) {
                    int a = L.get(i);
                    int b = L.get(j);
                    int c = L.get(k);

                    if(Math.abs(b - c) < a && a < (b + c)) {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);

        scanner.close();
    }
}