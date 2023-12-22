import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] lines = line.split(" ", 0);
        int height = Integer.parseInt(lines[0]);
        int width = Integer.parseInt(lines[1]);
        int numobj = Integer.parseInt(lines[2]);
        
        int[] heightNum = new int[height];
        int[] widthNum = new int[width];
        int maxHeight = 0;
        int maxWidth = 0;
        int maxHeightPos = -1;
        int maxWidthPos = -1;
        boolean[][] existObj = new boolean[height][width];
        for (int i = 0; i < numobj; i++) {
            line = sc.nextLine();
            lines = line.split(" ", 0);

            int posH = Integer.parseInt(lines[0]);
            int posW = Integer.parseInt(lines[1]);
            heightNum[posH-1]++;
            widthNum[posW-1]++;
            existObj[posH-1][posW-1] = true;;
            if (maxHeight < heightNum[posH-1]) {
                maxHeight = heightNum[posH-1];
                maxHeightPos = posH-1;
            }
            if (maxWidth < widthNum[posW-1]) {
                maxWidth = widthNum[posW-1];
                maxWidthPos = posW-1;
            }
        }
        
        int ret = maxHeight + maxWidth + (existObj[maxHeightPos][maxWidthPos] ? -1 : 0);
        
        System.out.println(ret);
    }
}
