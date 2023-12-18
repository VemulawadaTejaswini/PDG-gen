import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.next());
        for (int i = 0; i < 120; i++) {
            for (int j = -120; j < 120; j++) {
                if (Math.pow(i, 5) - Math.pow(j, 5) == x){
                    System.out.println(i + " " + j);
                    return;
                }
            }
        }
    }
}