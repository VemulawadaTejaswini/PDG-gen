import java.util.*;

public class Main {

    public static void main(String[] args) {
//        long startTime = System.currentTimeMillis();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Integer[] A = new Integer[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        scanner.close();

        // Aを絶対値の昇順にソート
        Arrays.sort(A, (o1, o2) -> {
            Integer abs1 = Math.abs(o1);
            Integer abs2 = Math.abs(o2);
            return abs1.compareTo(abs2);
        });
//        System.out.print("[");
//        for (Integer i : A) {
//            System.out.print(i + ",");
//
//        }
//        System.out.println("]");


        List<Integer[]> selectList = new ArrayList<>();
        int count = 0;
        int last = A[N - 1];
        boolean plus = false;
        if (last > 0) {
            plus = true;
        }
//        System.out.println("plus::"+plus);
        for (int i = 0; i < N; i++) {
            int tmpCount = count;
//            System.out.println("A["+i+"]:"+A[i]);
            if (i == 0) {
                int tmpA = A[i + 1] - A[i];
                int tmpB = A[i] - A[i + 1];
                count = (plus) ? Math.min(tmpA, tmpB) : Math.max(tmpA, tmpB);
                if (count == tmpA) {
                    Integer[] xy = new Integer[2];
                    xy[0] = A[i + 1];
                    xy[1] = A[i];
                    selectList.add(xy);
                } else {
                    Integer[] xy = new Integer[2];
                    xy[0] = A[i];
                    xy[1] = A[i + 1];
                    selectList.add(xy);
                }
//                System.out.println("0!"+count);
                continue;
            }
            if (i == 1) {
                continue;
            }

            if (i == (N - 1)) {
                int tmpA = count - A[i];
                int tmpB = A[i] - count;
                count = Math.max(tmpA, tmpB);
//                System.out.println("N-1!"+count);
                if (count == tmpA) {
                    Integer[] xy = new Integer[2];
                    xy[0] = tmpCount;
                    xy[1] = A[i];
                    selectList.add(xy);
                } else {
                    Integer[] xy = new Integer[2];
                    xy[0] = A[i];
                    xy[1] = tmpCount;
                    selectList.add(xy);
                }
                continue;
            }

            int tmpA = count - A[i];
            int tmpB = A[i] - count;
//            System.out.println("tmpA:"+tmpA);
//            System.out.println("tmpB:"+tmpB);
            count = (plus) ? Math.min(tmpA, tmpB) : Math.max(tmpA, tmpB);
//            System.out.println(i+":"+count);
            if (count == tmpA) {
                Integer[] xy = new Integer[2];
                xy[0] = tmpCount;
                xy[1] = A[i];
                selectList.add(xy);
            } else {
                Integer[] xy = new Integer[2];
                xy[0] = A[i];
                xy[1] = tmpCount;
                selectList.add(xy);
            }
        }

        System.out.println(count);
        for (Integer[] xy : selectList) {
            System.out.println(xy[0] + " " + xy[1]);
        }
    }

}

