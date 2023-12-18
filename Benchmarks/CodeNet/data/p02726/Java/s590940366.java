import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt() - 1;
        int y = sc.nextInt() - 1;
        int jump = 1;
        int []arr = new int[n-1];
       Start start;
       End end;
        for (int i=0; i < n; i++) {
            if (i < x) start = Start.LEFT;
            else if(i >= x && i <= y) start = Start.INSIDE;
            else start = Start.RIGHT;
            for (int j=i+1;  j < n; j++) {
                if (j < x) end = End.LEFT;
                else if (j >= x && j <= y) end = End.INSIDE;
                else end = End.RIGHT;

                if (start == Start.LEFT) {
                    if (end == End.LEFT) arr[j-i-1]++;
                    else if (end == End.INSIDE) {
                        int distance = Math.min(j-i, x-i+jump+y-j);
                        arr[distance-1]++;
                    }
                    else if (end == End.RIGHT) {
                        arr[x-i + jump + j-y -1]++;
                        //System.out.println("PIYO!");
                    }
                } else if (start == Start.INSIDE) {
                    if (end == End.INSIDE) {
                        int distance = Math.min(j - i, i - x + jump + y - j);
                        arr[distance - 1]++;
                    } else if(end == End.RIGHT) {
                        int distance = Math.min(j-i, i-x + jump + j-y);
                        arr[distance-1]++;
                    }
                } else if (start == Start.RIGHT) {
                    arr[j-i-1]++;
                }
            }
        }
        for (int a: arr) System.out.println(a);
    }
    enum Start { LEFT, INSIDE, RIGHT}
    enum End { LEFT, INSIDE, RIGHT}
}
