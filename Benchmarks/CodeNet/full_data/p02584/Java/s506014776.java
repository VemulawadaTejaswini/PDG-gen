import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] lines = line.split(" ", 0);

        long start = Long.parseLong(lines[0]);
        long num = Long.parseLong(lines[1]);
        long dis = Long.parseLong(lines[2]);
        long abstart = Math.abs(start);
        
        if (1.0 * start / dis > num) {
            System.out.println(start - num * dis);
            return;
        }

        if (abstart <= dis) {
            if (num % 2 == 0) {
                System.out.println(abstart);
            } else {
                if (start < 0) {
                    System.out.println(abstart);
                } else {
                    System.out.println(Math.abs(start - dis));
                }
            }
            return;
        }

        long temp = abstart / dis;
        long ret = 0;
        if (temp % 2 == 0) {
            if (num % 2 == 0) {
                if (start < 0) {
                    ret = start + temp * dis;
                } else {
                    ret = start - temp * dis;
                }
            } else {
                if (start < 0) {
                    ret = start + (temp + 1) * dis;
                } else {
                    ret = start - (temp + 1) * dis;
                }
            }
        } else {
            if (num % 2 == 0) {
                if (start < 0) {
                    ret = start + (temp + 1) * dis;
                } else {
                    ret = start - (temp + 1) * dis;
                }
            } else {
                if (start < 0) {
                    ret = start + temp * dis;
                } else {
                    ret = start - temp * dis;
                }
            }
        }
        System.out.println(Math.abs(ret));
    }
}
