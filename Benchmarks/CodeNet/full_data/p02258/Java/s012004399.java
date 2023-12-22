import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        int rt[] = new int[n];
        int diff[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            rt[i] = Integer.parseInt(sc.next());  
        }

        int max = rt[1] - rt[0];
        int temp;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                temp = rt[j] - rt[i];

                if (temp > max) {
                    max = temp;
                }
            }
        }

        System.out.println(max);
    }
}