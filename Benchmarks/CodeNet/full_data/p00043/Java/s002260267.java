import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int[] n = new int[9];
            char[] list = sc.nextLine().toCharArray();
            for (int i : list) {
                n[i - '1']++;
            }
            List<Integer> result = new ArrayList<>();

            for (int i = 0; i < 9; i++) {
                 for (int j = 0; j < 9; j++) {
                    if (n[i] < 4 && (n[j] >= 2 || n[i] >= 1)) {
                        int[] temp = n.clone();
                        temp[i]++;
                        temp[j] -= 2;
                        for (int k = 0; k < 7; k++) {
                            if ((temp[k] == 1 || temp[k] == 4) && temp[k + 1] > 0 && temp[k + 2] > 0) {
                                temp[k]--;
                                temp[k + 1]--;
                                temp[k + 2]--;
                            }
                            if (temp[k] == 2 && temp[k + 1] >= 2 && temp[k + 2] >= 2) {
                                temp[k] -= 2;
                                temp[k + 1] -= 2;
                                temp[k + 2] -= 2;
                            }
                        }
                        boolean f = true;
                        for (int k : temp) {
                            if (k % 3 != 0) {
                                f = false;
                                break;
                            }
                        }
                        if (f) {
                            result.add(i + 1);
                            break;
                        }
                    }
                }
            }
            if (result.isEmpty()) {
                System.out.println(0);
            } else {
                for (int i = 0; i < result.size(); i++) {
                    System.out.print(i<result.size()-1?result.get(i) + " ":result.get(i)+"\n");
                }
            }
        }
    }
}
