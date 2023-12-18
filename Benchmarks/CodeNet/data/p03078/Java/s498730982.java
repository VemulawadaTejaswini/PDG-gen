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
        // Arrays.sort(xList);
        // Arrays.sort(yList);
        // Arrays.sort(zList);
        tasteList = new long[x * y * x];
        int index = 0;
        for (int l = 0; l < x; l++) {
            for (int m = 0; m < y; m++) {
                for (int n = 0; n < z; n++) {
                    tasteList[index++] = xList[l] + yList[m] + zList[n];
                }  
            }    
        }
        System.out.println(index);
    }
     
    private void exec() {
        Arrays.sort(tasteList);
        for (int i = 1; i <= tasteList.length; i++) {
             System.out.println(String.valueOf(tasteList[tasteList.length - i]));
        }
    }
}