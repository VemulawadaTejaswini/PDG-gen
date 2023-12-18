import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] dishes = new int[5];
        for (int i = 0; i < dishes.length; i++) {
            dishes[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int[] tmpOrder = new int[dishes.length];

        for (int a = 0; a < dishes.length; a++) {
            tmpOrder[0] = dishes[a];

            for (int b = 0; b < dishes.length; b++) {
                tmpOrder[1] = dishes[b];

                for (int c = 0; c < dishes.length; c++) {

                    tmpOrder[2] = dishes[c];

                    for (int d = 0; d < dishes.length; d++) {

                        tmpOrder[3] = dishes[d];

                        for (int e = 0; e < dishes.length; e++) {
                            tmpOrder[4] = dishes[e];

                            // 同じ料理があったらスキップ
                            boolean exist = search(new int[]{a, b, c, d, e});
                            if (exist) {
                                continue;
                            } else {

                                int tmpTime = time(tmpOrder);
                                if (min > tmpTime) {
                                    min = tmpTime;
                                }
                            }
                        }
                    }
                }
            }
        }

        System.out.println(min);

    }

    private static boolean search(int[] array) {

        boolean exist = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {

                if (i == j) continue;

                if (array[i] == array[j]) {
                    exist = true;
                    break;
                }
            }
        }

        return exist;
    }

    private static int time(int[] dishes) {
        int time = 0;
        for (int i = 0; i < dishes.length; i++) {
            time += dishes[i];

            if (time % 10 == 0) continue;

            if (!(i == dishes.length -1)) {
                time += (10 - time % 10);
            }
        }

        return time;
    }
}
