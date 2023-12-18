import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 2) {
            System.out.println(0);
            return;
        }
        boolean up = true;
        boolean down = true;
        int tmp = sc.nextInt();
        int tmp2 = sc.nextInt();
        if (tmp < tmp2) {
            down = false;
        }
        if (tmp > tmp2) {
            up = false;
        }
        n--;
        n--;
        
        int prev = tmp2;
        int count = 0;
        while (n-- > 0) {
            int next = sc.nextInt();
            if (up && !down) {
                if (prev > next) {
                    // System.out.println(prev + " " + next);
                    count++;
                    prev = next;
                    if (n == 0) break;
                    next = sc.nextInt();
                    n--;
                    up = true;
                    down = true;
                    if (prev < next) {
                        down = false;
                    }
                    if (prev > next) {
                        up = false;
                    }
                    prev = next;
                    continue;
                }
            } else if (!up && down) {
                if (prev < next) {
                    count++;
                    prev = next;
                    if (n == 0) break;
                    next = sc.nextInt();
                    n--;
                    up = true;
                    down = true;
                    if (prev < next) {
                        down = false;
                    }
                    if (prev > next) {
                        up = false;
                    }
                    prev = next;
                    continue;
                }
            }
            
            if (prev < next) {
                up = true;
                down = false;
            }
            if (prev > next) {
                up = false;
                down = true;
            }
            prev = next;
        }
        System.out.println(count+1);
        
    }
}