import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        List<Tenboudai> tenboudaiList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            tenboudaiList.add(new Tenboudai(sc.nextInt()));
        }

        for (int j = 0; j < M; j++) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            if (!tenboudaiList.get(A - 1).bridge.contains(B - 1)) {
                tenboudaiList.get(A - 1).bridge.add(B - 1);
            }
            if (!tenboudaiList.get(B - 1).bridge.contains(A - 1)) {
                tenboudaiList.get(B - 1).bridge.add(A - 1);
            }
        }

        int count = 0;
        for(int i = 0; i < tenboudaiList.size(); i++) {
            if (tenboudaiList.get(i).bridge.size() == 0) {
                continue;
            }

            boolean isMax = true;
            for (Integer otherTenboudai : tenboudaiList.get(i).bridge) {
                if (otherTenboudai > tenboudaiList.get(i).H) {
                    isMax = false;
                }
            }
            if(isMax) {
                count++;
            }
        }
        System.out.println(count);
    }
}

class Tenboudai {
    int H;
    List<Integer> bridge = new ArrayList<>();

    Tenboudai(int value) {
        this.H = value;
    }
}