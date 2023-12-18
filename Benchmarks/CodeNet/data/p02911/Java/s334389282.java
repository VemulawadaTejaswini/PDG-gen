import java.util.ArrayList;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int playerNum = sc.nextInt();
        int point = sc.nextInt();
        int correctCnt = sc.nextInt();

        ArrayList<Integer> playerPoint = new ArrayList<>(playerNum);
        ArrayList<Integer> correctPlayer = new ArrayList<>(correctCnt);
        for(int i = 0; i < correctCnt; i++){
            correctPlayer.add(sc.nextInt());
        }

        for(int i = 0; i < playerNum; i++){
            int result = point;
            for(int cr : correctPlayer){
                if(i + 1 != cr){
                    result -= 1;
                }
            }
            System.out.println(result > 0 ? "Yes" : "No");
        }
    }
}
