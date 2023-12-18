
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int W = scanner.nextInt();
        int K = scanner.nextInt();
        int[][] graph = new int[H][W];
        for (int i = 0; i < H; ++i) {
            String row = scanner.next();
            for (int j = 0; j < W; ++j) {
                char current = row.charAt(j);
                if (current == '0') {
                    graph[i][j] = 0;
                } else {
                    graph[i][j] = 1;
                }
            }
        }
        int[][] dp = new int[H][W];
        dp[0][0] = graph[0][0];
        for (int i = 0; i < H; ++i) {
            for (int j = 0; j < W; ++j) {
                if (i - 1 >= 0 && j - 1 >= 0) {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1] - dp[i - 1][j - 1] + graph[i][j];
                } else if (i - 1 >= 0) {
                    dp[i][j] = dp[i - 1][j] + graph[i][j];
                } else if (j - 1 >= 0) {
                    dp[i][j] = dp[i][j - 1] + graph[i][j];
                }
            }
        }
        int l = -1;
        int r = H * W;
        while (r - l > 1) {
            int mid = (l + r) / 2;
       //     System.out.println("l: " + l + " r: " + r + " mid: " + mid);
            boolean success =
                    isOk(graph, H, W, K, dp, mid);
       //     System.out.println("isOk: " + success);
            if (success) {
                r = mid;
            } else {
                l = mid;
            }
        }
        System.out.println(r);
    }
    public static boolean dfs(int H, int W, int K, int[][]dp, Set<Integer> cutRows, int totalCuts, int rowCuts, int currentRow, int currentCut) {
        if (currentRow == H) {
            if (currentCut != rowCuts) {
                return false;
            }
        }
     //   System.out.println("=========totalCuts: " + totalCuts);
        if (currentCut == rowCuts) {
//            for (int row : cutRows) {
//                System.out.println("cut row: " + row);
//
//            }
            int currentTotalCuts = currentCut;
            int lastColumn = -1;
            for (int j = 0; j < W; ++j) {
                boolean shouldCut = false;
                int lastRow = -1;
                for (int row : cutRows) {
             //       System.out.println("row: " + row + " j: " + j + " lastRow: " + lastRow + " lastColumn: " + lastColumn);
                    if (row == 0 && j == 0) {
//                        if (dp[0][0] > K) {
//                            return false;
//                        }
                    } else if (j == 0) {
                        if (lastRow == -1) {
                            if (dp[row][j] > K) {
                                return false;
                            }
                        }
                        else if (dp[row][j] - dp[lastRow][j] > K) {
                            return false;
                        }
                    } else if (row == 0) {
//                        if (dp[row][j] - dp[row][j - 1] > K) {
//                            return false;
//                        }
                        if (lastColumn == -1) {
                            if (dp[row][j] > K) {
                                shouldCut = true;
                            }
                        } else {
                            if (dp[row][j] - dp[row][lastColumn] > K) {
                                shouldCut = true;
                            }
                        }
                    } else {
//                        if (dp[row][j] - dp[row - 1][j] - dp[row][j - 1] + dp[row - 1][j - 1] > K) {
//                            return false;
//                        }
                        if (lastRow == -1 && lastColumn == -1) {
                       //     System.out.println("dp[" + row + "][" + j + "]: " + dp[row][j]);
                            if (dp[row][j] > K) {
                                shouldCut = true;
                            }
                        } else if (lastRow == -1) {
                            if (dp[row][j] - dp[row][lastColumn] > K) {
                                shouldCut = true;
                            }
                        } else if (lastColumn == -1) {
                            if (dp[row][j] - dp[lastRow][j] > K) {
                                shouldCut = true;
                            }
                        } else if (dp[row][j] - dp[lastRow][j] - dp[row][lastColumn] + dp[lastRow][lastColumn] > K) {
                            shouldCut = true;
                        }
                    }
                    lastRow = row;
                }
                if (shouldCut) {
                    currentTotalCuts++;
                    lastColumn = j - 1;
                //    System.out.println("currentTotalCuts: " + currentTotalCuts);
                }
            }
            return currentTotalCuts <= totalCuts;
        } else {
            boolean success =  dfs(H, W, K, dp, cutRows, totalCuts, rowCuts, currentRow + 1, currentCut);
            if (success) {
                return true;
            }
            cutRows.add(currentRow);
            success =  dfs(H, W, K, dp, cutRows, totalCuts, rowCuts, currentRow + 1, currentCut + 1);
            cutRows.remove(currentRow);
            cutRows.add(H - 1);
            return success;
        }

    }
    public static boolean isOk(int[][] graph, int H, int W, int K, int[][]dp, int totalCuts) {
        for (int rowCuts = 0; rowCuts <= H - 1; ++rowCuts) {
            Set<Integer> cutRows = new HashSet<>();
            cutRows.add(H - 1);
      //      System.out.println("#rowCuts: " + rowCuts);
            boolean success = dfs(graph, H, W, K, dp, cutRows, totalCuts, rowCuts, 0, 0);
       //     System.out.println("rowCuts:" + rowCuts + " success: " + success);
            if (success) {
                return true;
            }
        }
        return false;
    }
}
