import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<Integer> aList = new ArrayList<Integer>();
        ArrayList<Integer> bList = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            aList.add(sc.nextInt());
        }
        for (int i = 0; i < m; i++) {
            bList.add(sc.nextInt());
        }
        sc.close();

        int time = 0;
        int i = 0;
        int j = 0;
        int count = 0;
        while(true) {
            if (k < time) {
                break;
            }
            if (i < n && j < m) {
                Integer a = aList.get(i);
                Integer b = bList.get(j);
                if (time + a <= k && time + b <= k) {
                    if (a <= b) {
                        time += a;
                        i++;
                        count++;
                    } else {
                        time += b;
                        j++;
                        count++;
                    }
                } else if (time + a <= k) {
                    time += a;
                    i++;
                    count++;
                } else if (time + b <= k) {
                    time += b;
                    j++;
                    count++;
                } else {
                    break;
                }
            } else if (i < n) {
                Integer a = aList.get(i);
                if (time + a <= k) {
                    time += a;
                    i++;
                    count++;
                } else {
                    break;
                }
            } else if (j < m) {
                Integer b = bList.get(j);
                if (time + b <= k) {
                    time += b;
                    j++;
                    count++;
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        System.out.println(count);
    }
}
