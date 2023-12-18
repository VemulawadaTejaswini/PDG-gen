import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by zzt on 17-1-22.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Contestant> contestants = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            contestants.add(new Contestant());
        }
        int a;
        for (int i = 1; i < N; i++) {
            a = scanner.nextInt();
            contestants.get(a - 1).defeatList.add(contestants.get(i));
        }
        long ret = 0;
        for (int i = 0; i < N; i++) {
            ret = Math.max(ret, contestants.get(i).matchCount());
        }

        System.out.println(ret);
    }

    static class Contestant {
        List<Contestant> defeatList;
        long matchCount = 0;

        Contestant() {
            defeatList = new ArrayList<>();
        }

        long matchCount() {
            if (matchCount==0) {
                switch (defeatList.size()) {
                    case 0:
                        matchCount = 1;
                        break;
                    case 1:
                        matchCount = defeatList.get(0).matchCount() + 1;
                        break;
                    default:
                        long ret = 0;
                        for (int i = 0; i < defeatList.size(); i++) {
                            ret = Math.max(ret, defeatList.get(i).matchCount());
                        }
                        matchCount = ret;
                        break;
                }
            }
            return matchCount;
        }
    }
}