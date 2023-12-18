import java.util.*;
     
public class Main {
    
    private long[] tasteList;
    private int k = 0;
     
    public static void main(String[] args) {
        Main m = new Main();
        m.read();
        m.exec();
    }
     
    private void read() {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        k = scan.nextInt();
        long[] xList = new long[x];
        for (int i = 0; i < x; i++) {
            xList[i] = scan.nextLong();
        }
        long[] yList = new long[y];
        for (int i = 0; i < y; i++) {
            yList[i] = scan.nextLong();
        }
        long[] zList = new long[z];
        for (int i = 0; i < z; i++) {
            zList[i] = scan.nextLong();
        }
        Arrays.sort(xList);
        Arrays.sort(yList);
        Arrays.sort(zList);
        int index = 0;
        int xMax = 3 * k * x / (x + y + z);
        int yMax = 3 * k * y / (x + y + z);
        int zMax = 3 * k * z / (x + y + z);
        if (xMax > x || xMax == 0) {
            xMax = x;
        }
        if (yMax > y || yMax == 0) {
            yMax = y;
        }
        if (zMax > z || zMax == 0) {
            zMax = z;
        }
        tasteList = new long[xMax * yMax * zMax];
        for (int l = 1; l <= xMax; l++) {
            for (int m = 1; m <= yMax; m++) {
                for (int n = 1; n <= zMax; n++) {
                    tasteList[index++] = xList[x - l] + yList[y - m] + zList[z - n];
                }  
            }    
        }
    }
     
    private void exec() {
        Arrays.sort(tasteList);
        for (int i = 1; i <= tasteList.length; i++) {
             System.out.println(String.valueOf(tasteList[tasteList.length - i]));
        }
    }
}