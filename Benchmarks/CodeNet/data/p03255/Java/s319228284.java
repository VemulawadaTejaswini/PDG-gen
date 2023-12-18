import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long X = sc.nextLong();

        long[] garbagePositionArr = new long[N];
        for (int i = 0; i < N; i++) {
            garbagePositionArr[i] = sc.nextLong();
        }

        long currentPosition = 0;
        int stockGarbage = 0;

        long consumedEnergy = 0;
        long positionGap = 0;
        long moveEnergy = 0;
        long moveOrigPower = 0;

        for (int i = N-1; i >= 0; i--) {
            if (currentPosition == 0) {
                currentPosition = garbagePositionArr[i];
                moveEnergy = ((stockGarbage+1) * (stockGarbage+1)) * currentPosition;
                consumedEnergy += moveEnergy + X;
                stockGarbage++;
            }
            if (currentPosition != 0) {
                moveOrigPower = (stockGarbage+1) * (stockGarbage+1);
                if (moveOrigPower > X) {
                    moveEnergy = ((stockGarbage+1) * (stockGarbage+1)) * currentPosition;
                    consumedEnergy += moveEnergy + X;
                    currentPosition = 0;
                    stockGarbage = 0;
                    continue;
                }
                if (currentPosition != garbagePositionArr[i]) {
                    positionGap = currentPosition - garbagePositionArr[i];
                    moveEnergy = ((stockGarbage+1) * (stockGarbage+1)) * positionGap;
                    consumedEnergy += moveEnergy + X;
                    currentPosition = garbagePositionArr[i];
                    stockGarbage++;
                }
            }
        }
        if (currentPosition != 0) {
            moveEnergy = ((stockGarbage+1) * (stockGarbage+1)) * currentPosition;
            consumedEnergy += moveEnergy + X;
        }
        System.out.println(consumedEnergy);





    }
}
