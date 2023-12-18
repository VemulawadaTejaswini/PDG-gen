import java.util.ArrayList;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int playerNum = sc.nextInt();
        int firstPoint = sc.nextInt();

        ArrayList<Integer> playerPoint = new ArrayList<>();

        for(int i = 0 ; i < playerNum; i++){
            playerPoint.add(0);
        }

        int cnt = sc.nextInt();
        for(int i = 0 ; i < cnt; i++){
            int p = sc.nextInt();
            playerPoint.set(p - 1, playerPoint.get(p - 1) + 1);
        }

        for(int i = 0; i < playerNum; i++){
            System.out.println(firstPoint - cnt + playerPoint.get(i) > 0 ? "Yes" : "No");
        }
    }
}