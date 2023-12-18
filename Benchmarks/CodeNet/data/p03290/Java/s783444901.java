import java.util.*;

public class Main {
    static int ans = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int goalScore = sc.nextInt();
        int[] points = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] bonusPoints = new int[n];
        for (int i = 0; i < n; i++) {
            map.put((i + 1) * 100, sc.nextInt());
            bonusPoints[i] = sc.nextInt();
        }
        int num = 0;
        int currentScore = 0;
        int maxPoint = n * 100;
        hoge: for(int i = 0; i < map.size(); i++) {
            int numOfQuestions = map.get(maxPoint);
            while(numOfQuestions > 0) {
                num++;
                currentScore += maxPoint;
                if(numOfQuestions == 1) currentScore += bonusPoints[n-1];
                if(currentScore >= goalScore) {
                    ans = Math.min(ans, num);
                    break hoge;
                }
                numOfQuestions--;
            }
            maxPoint -= 100;
        }
        hoge(0, goalScore, 0, map, maxPoint, bonusPoints);
        System.out.println(ans);
    }
    private static void hoge(int currentScore, int goalScore, int numOfQuestions, HashMap<Integer, Integer> map, int pointKey, int[] bonus) {
        if(currentScore >= goalScore) {
            ans = Math.min(ans, numOfQuestions);
            return;
        }
        if(pointKey <= 0) return;
        int num = map.get(pointKey);
        hoge(currentScore + (pointKey * num + bonus[pointKey / 100 - 1]), goalScore, numOfQuestions + num, map, pointKey - 100, bonus);
        hoge(currentScore, goalScore, numOfQuestions, map, pointKey - 100, bonus);
    }
}