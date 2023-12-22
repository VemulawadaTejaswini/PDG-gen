import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int counter[] = new int[128];
            while(sc.hasNext()) {
                String s = sc.nextLine().toLowerCase();
                for (int i = 0; i < s.length(); i++) {
                    int num = s.charAt(i);
                    counter[num]++;
                }
            }
            for(char i = 'a'; i <= 'z'; i++) {
                System.out.printf("%s : %d\n", i, counter[i]);
            }
        }
    }
}
