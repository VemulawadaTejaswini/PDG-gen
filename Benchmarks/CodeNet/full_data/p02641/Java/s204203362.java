import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int n = sc.nextInt();

        if(n == 0) {
            System.out.println(x);
            System.exit(0);
        }

        int[] p = new int[102];
        boolean[] isGivenNum = new boolean[102];
        boolean isXMatched = false;
        int xIndex = 0;

        for(int i=0; i<n; i++) {
            int tmp = sc.nextInt();
            p[tmp] = Math.abs(x-tmp);
            isGivenNum[tmp] = true;
            if(tmp == x) {
                xIndex = tmp;
                isXMatched = true;
            }
        }

        if(!isXMatched) {
            System.out.println(x);
            System.exit(0);
        }

        int fIndex = 101;
        int fDistance = 0;
        for(int i=xIndex; i<p.length; i++) {
            if(isGivenNum[i] == false) {
                fIndex = i;
                fDistance = i - xIndex;
                break;
            }
        }

        int bIndex = 0;
        int bDistance = 0;
        for(int i=xIndex; i>=0; i--) {
            if(isGivenNum[i] == false) {
                bIndex = i;
                bDistance = xIndex - i;
                break;
            }
        }

        if(fIndex == 101) {
            System.out.println(fIndex);
        } else if(bIndex == 0) {
            System.out.println(bIndex);
        } else {
            if(fDistance == bDistance) {
                System.out.println(Math.min(bIndex, fIndex));
            } else if(fDistance > bDistance) {
                System.out.println(bIndex);
            } else {
                System.out.println(fIndex);
            }
        }
    }
}
