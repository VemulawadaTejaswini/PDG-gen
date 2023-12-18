import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        char map[][] = new char[h][w];
        for (int i = 0; i < h; i++) {
            map[i] = sc.next().toCharArray();
        }
        int hokoPoint[][] = new int[h][w];
        for (int i = 0; i < h; i++) {
            int[] arr = new int[w];
            for (int j = 0; j < w; j++) {
                if(map[i][j]=='#') {
                    arr[j] = 0;
                } else {
                    arr[j] = 1;
                    if(j > 0) arr[j] += arr[j-1];
                }
            }
            for(int j = w-1; j > 0; j--) {
                if(arr[j-1] != 0 && arr[j] != 0) {
                    arr[j-1] = arr[j];
                }
            }
            hokoPoint[i] = arr;
        }

//        for (int i = 0; i < h; i++) {
//            System.out.println(Arrays.toString(hokoPoint[i]));
//        }

        int tatePoint[][] = new int[w][h];
        for (int i = 0; i < w; i++) {
            int[] arr = new int[h];
            for (int j = 0; j < h; j++) {
                if(map[j][i]=='#') {
                    arr[j] = 0;
                } else {
                    arr[j] = 1;
                    if(j > 0) arr[j] += arr[j-1];
                }
            }
            for(int j = h-1; j > 0; j--) {
                if(arr[j-1] != 0 && arr[j] != 0) {
                    arr[j-1] = arr[j];
                }
            }
            tatePoint[i] = arr;
        }
//        for (int i = 0; i < w; i++) {
//            System.out.println(Arrays.toString(tatePoint[i]));
//        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                max = Math.max(max, hokoPoint[i][j] + tatePoint[j][i]);
            }
        }
        System.out.println(max-1);
    }
}
