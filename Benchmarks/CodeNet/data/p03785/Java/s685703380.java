import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int C = sc.nextInt();
        int K = sc.nextInt();

        List<Integer> timeList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            timeList.add(sc.nextInt());
        }

        Bus bus = new Bus(C, K, timeList);
        int count = bus.getBusNumber();

        System.out.println(count);
    }
}

class Bus {
    private int limitNumber;
    private int limitTime;
    private List<Integer> timeList;

    public Bus(int limitNumber, int limitTime, List<Integer> list) {
        this.limitNumber = limitNumber;
        this.limitTime = limitTime;
        this.timeList = list;
    }

    public int getBusNumber() {
        int count = 0;
        for (int i = limitNumber; i < timeList.size();) {
            int finalTime = timeList.get(i);
            if (finalTime <= limitTime) {
                count++;
                i += limitNumber;
            } else {
                Loop:
                for (int j = i - 1; j >= 0; j--) {
                    finalTime = timeList.get(j);
                    if (finalTime <= limitTime) {
                        count++;
                        i = j;
                    } else {
                        continue Loop;
                    }
                }
            }
        }

        return count;
    }
}