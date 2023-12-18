import java.util.*;

public class Main {

    public static void main(String[] args) {
//        long startTime = System.currentTimeMillis();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A = scanner.nextInt() - 1;
        int B = scanner.nextInt() - 1;
        int C = scanner.nextInt() - 1;
        int D = scanner.nextInt() - 1;
        String S = scanner.next();
        scanner.close();

        // Sを分解
        String[] str = S.split("");

        // A to Cの履歴
        ArrayList<Integer> historyAtoC = new ArrayList<>();
        historyAtoC.add(A);

        // B to Dの履歴
        ArrayList<Integer> historyBtoD = new ArrayList<>();
        historyBtoD.add(B);

        // A to C
        boolean isAtoC = false;
        // 0 -> ok 1-> idxBtoCと一致でNG  2-> #でNG
        int isMoveAtoC = 0;
        int idxAtoC = A;
        // B to D
        boolean isBtoD = false;
        int isMoveBtoD = 0;
        int idxBtoD = B;

        // 目的地が後ろを優先
        boolean priorityA = (C > D);

        // C > D の場合、AがBより後ろにいくようにする
        if (priorityA) {
            while (true) {
                // check
                if (idxAtoC > idxBtoD) {
                    break;
                }

                if ((isMoveAtoC == 2 && isMoveBtoD == 2)
                        || (isMoveAtoC == 1 && isMoveBtoD == 2)
                        || (isMoveAtoC == 2 && isMoveBtoD == 1)
                ) {
                    break;
                }

//                System.out.println("idxAtoC::" + idxAtoC);
//                System.out.println("idxBtoD::" + idxBtoD);
//                System.out.println("isMoveAtoC::" + isMoveAtoC);
//                System.out.println("isMoveBtoD::" + isMoveBtoD);
//                System.out.println("priorityA::" + priorityA);
                // A to C
                if (isMoveAtoC == 0 && priorityA) {
                    boolean isNotOverA_1 = (idxAtoC + 1 <= C);
                    boolean isNotOverA_2 = (idxAtoC + 2 <= C);
                    if (isNotOverA_2 && (".".equals(str[idxAtoC + 2])) && (idxAtoC + 2 != idxBtoD)) {
                        // 2マス移動
                        idxAtoC = idxAtoC + 2;
                        historyAtoC.add(idxAtoC);
                        if (isMoveBtoD == 1) {
                            isMoveBtoD = 0;
                        }
                    } else if (isNotOverA_1 && (".".equals(str[idxAtoC + 1])) && (idxAtoC + 1 != idxBtoD)) {
                        // 1マス移動
                        idxAtoC = idxAtoC + 1;
                        historyAtoC.add(idxAtoC);
                        if (isMoveBtoD == 1) {
                            isMoveBtoD = 0;
                        }
                    } else if ((idxAtoC + 1 == idxBtoD) || (idxAtoC + 2 == idxBtoD)) {
                        isMoveAtoC = 1;
                        priorityA = false;
                    } else {
                        // 移動不可
                        isMoveAtoC = 2;
                        priorityA = false;
                    }
                    continue;
                }

                // B to D
                if (isMoveBtoD == 0 && !priorityA) {
                    boolean isNotOverB_1 = (idxBtoD + 1 <= D);
                    boolean isNotOverB_2 = (idxBtoD + 2 <= D);

                    if (isNotOverB_1 && (".".equals(str[idxBtoD + 1])) && (idxBtoD + 1 != idxBtoD)) {
                        // 1マス移動
                        idxBtoD = idxBtoD + 1;
                        historyAtoC.add(idxBtoD);
                        if (isMoveAtoC == 1) {
                            isMoveAtoC = 0;
                            priorityA = true;
                        }
                    } else if (isNotOverB_2 && (".".equals(str[idxBtoD + 2])) && (idxBtoD + 2 != idxAtoC)) {
                        // 2マス移動
                        idxBtoD = idxBtoD + 2;
                        historyAtoC.add(idxBtoD);
                        if (isMoveAtoC == 1) {
                            isMoveAtoC = 0;
                            priorityA = true;
                        }
                    } else if ((idxBtoD + 1 == idxAtoC) && (idxBtoD + 2 == idxAtoC)) {
                        isMoveBtoD = 1;
                        priorityA = true;
                    } else {
                        // 移動不可
                        isMoveBtoD = 2;
                        priorityA = true;
                    }
                }
            }
        }


        // move
        while (true) {
//            System.out.println("idxAtoC::" + idxAtoC);
//            System.out.println("idxBtoD::" + idxBtoD);
//            System.out.println("isMoveAtoC::" + isMoveAtoC);
//            System.out.println("isMoveBtoD::" + isMoveBtoD);
//            System.out.println("priorityA::" + priorityA);
            // 両方move不可
            if ((isMoveAtoC == 2 && isMoveBtoD == 2)
                    || (isMoveAtoC == 1 && isMoveBtoD == 2)
                    || (isMoveAtoC == 2 && isMoveBtoD == 1)
            ) {
                break;
            }

            // 両方のindexが目的地の場合
            if (idxAtoC == C && idxBtoD == D) {
                isAtoC = true;
                isBtoD = true;
                break;
            }

            // A to C
            if (isMoveAtoC == 0 && priorityA) {
                boolean isNotOverA_1 = (idxAtoC + 1 <= C);
                boolean isNotOverA_2 = (idxAtoC + 2 <= C);
                if (isNotOverA_2 && (".".equals(str[idxAtoC + 2])) && (idxAtoC + 2 != idxBtoD)) {
                    // 2マス移動
                    idxAtoC = idxAtoC + 2;
                    historyAtoC.add(idxAtoC);
                    if (isMoveBtoD == 1) {
                        isMoveBtoD = 0;
                    }
                } else if (isNotOverA_1 && (".".equals(str[idxAtoC + 1])) && (idxAtoC + 1 != idxBtoD)) {
                    // 1マス移動
                    idxAtoC = idxAtoC + 1;
                    historyAtoC.add(idxAtoC);
                    if (isMoveBtoD == 1) {
                        isMoveBtoD = 0;
                    }
                } else if ((idxAtoC + 1 == idxBtoD) || (idxAtoC + 2 == idxBtoD)) {
                    isMoveAtoC = 1;
                    priorityA = false;
                } else {
                    // 移動不可
                    isMoveAtoC = 2;
                    priorityA = false;
                }
                continue;
            }

            // B to D
            if (isMoveBtoD == 0 && !priorityA) {
                boolean isNotOverB_1 = (idxBtoD + 1 <= D);
                boolean isNotOverB_2 = (idxBtoD + 2 <= D);

                if (isNotOverB_2 && (".".equals(str[idxBtoD + 2])) && (idxBtoD + 2 != idxAtoC)) {
                    // 2マス移動
                    idxBtoD = idxBtoD + 2;
                    historyAtoC.add(idxBtoD);
                    if (isMoveAtoC == 1) {
                        isMoveAtoC = 0;
                    }
                } else if (isNotOverB_1 && (".".equals(str[idxBtoD + 1])) && (idxBtoD + 1 != idxBtoD)) {
                    // 1マス移動
                    idxBtoD = idxBtoD + 1;
                    historyAtoC.add(idxBtoD);
                    if (isMoveAtoC == 1) {
                        isMoveAtoC = 0;
                    }
                } else if ((idxBtoD + 1 == idxAtoC) && (idxBtoD + 2 == idxAtoC)) {
                    isMoveBtoD = 1;
                    priorityA = true;
                } else {
                    // 移動不可
                    isMoveBtoD = 2;
                    priorityA = true;
                }
            }
        }

        // どちらかfalseの場合、Noとして終了
        if (isAtoC || isBtoD) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

//        System.out.println(System.currentTimeMillis() - startTime);
    }

}
