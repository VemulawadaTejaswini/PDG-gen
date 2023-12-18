import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] x = new int[n][n];
        int[][] y = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            for (int j = 0; j < a; j++) {
                x[i][j] = sc.nextInt() - 1;
                y[i][j] = sc.nextInt();
            }
            x[i][a] = 999;
            y[i][a] = 999;
        }
        
        int[] answer = new int[n];
        int max = 0;
        
        for (int i = 0; i < n; i++) {
            answer[i] = 9;
        }
        
        answer[0] = 1;
        int ans1 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (x[i][j] == 999) break;
                
                if (answer[i] == 1) {
                    if (answer[x[i][j]] == 9) {
                        answer[x[i][j]] = y[i][j];
                    } else if (answer[x[i][j]] != y[i][j]) {
                        ans1 = -1;
                        break;
                    }
                    answer[x[i][j]] = y[i][j];
                } else if (answer[i] == 9) {
                    if (answer[x[i][j]] == 9) {
                        answer[i] = 1;
                        answer[x[i][j]] = y[i][j];
                    } else if (answer[x[i][j]] != y[i][j]) {
                        answer[i] = 0;
                    } else {
                        answer[i] = 1;
                    }
                } else {
                    if (answer[x[i][j]] == 9) {
                        answer[x[i][j]] = 1 - y[i][j];
                    } else if (answer[x[i][j]] == y[i][j]) {
                        ans1 = -1;
                        break;
                    }
                    answer[x[i][j]] = 1 - y[i][j];
                }
            }
            
            if (ans1 == -1) {
                break;
            }
        }
        
        if (ans1 != -1) {
            for (int i = 0; i < n; i++) {
                if (answer[i] == 1) {
                    ans1++;
                }
            }
        }
        
        for (int i = 0; i < n; i++) {
            answer[i] = 9;
        }
        answer[0] = 0;
        int ans2 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (x[i][j] == 999) break;
                
                if (answer[i] == 1) {
                    if (answer[x[i][j]] == 9) {
                        answer[x[i][j]] = y[i][j];
                    } else if (answer[x[i][j]] != y[i][j]) {
                        ans2 = -1;
                        break;
                    }
                    answer[x[i][j]] = y[i][j];
                } else if (answer[i] == 9) {
                    if (answer[x[i][j]] == 9) {
                        answer[i] = 1;
                        answer[x[i][j]] = y[i][j];
                    } else if (answer[x[i][j]] != y[i][j]) {
                        answer[i] = 0;
                    } else {
                        answer[i] = 1;
                    }
                } else {
                    if (answer[x[i][j]] == 9) {
                        answer[x[i][j]] = 1 - y[i][j];
                    } else if (answer[x[i][j]] == y[i][j]) {
                        ans2 = -1;
                        break;
                    }
                    answer[x[i][j]] = 1 - y[i][j];
                }
            }
            
            if (ans2 == -1) {
                break;
            }
        }
        
        if (ans2 != -1) {
            for (int i = 0; i < n; i++) {
                if (answer[i] == 1) {
                    ans2++;
                }
            }
        }
        
        if (ans1 == -1 || ans2 == -1) {
            System.out.println(0);
        } else {
            System.out.println(Math.max(ans1, ans2));
        }
    }
}
