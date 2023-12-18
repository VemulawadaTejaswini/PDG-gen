
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qNumber = sc.nextInt();
        ArrayList<Integer> answerTimes = new ArrayList<>();
        for (int i = 0; i < qNumber; i++) {
            answerTimes.add(sc.nextInt());
        }
        int sum = 0;
        for (Integer time : answerTimes) {
            sum += time;
        }
        int drinkTypes = sc.nextInt();
        int updatedQuestionId;
        int updatedTime;
        int answer;
        for (int i = 0; i < drinkTypes; i++) {
            updatedQuestionId  = sc.nextInt();
            updatedTime = sc.nextInt();
            answer = sum - answerTimes.get(updatedQuestionId-1) + updatedTime;
            System.out.println(answer);
        }


    }
}
