import java.util.Scanner;

public class Main {

	static int H;
	static int W;
	static int Dh;
	static int Dw;
	static int min;
	static boolean canClear;

        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

                H = scan.nextInt();
                W = scan.nextInt();
                int Ch = scan.nextInt() - 1;
                int Cw = scan.nextInt() - 1;
                Dh = scan.nextInt() - 1;
                Dw = scan.nextInt() - 1;

                String[][] map = new String[H][W];

                for (int h = 0; h < H; h++) {
                	String temp = scan.next();
                	for (int w = 0; w < W; w++) {
                		map[h][w] = temp.substring(w,w+1);
                	}
                }

                min = 2100000000;
                canClear = false;

                dps(map,Ch, Cw, 0);

                if (canClear) {
                	System.out.println(min);
                } else {
                	System.out.println(-1);
                }

                scan.close();

        }

        public static void dps(String[][] map, int ch, int cw, int count) {

        	if (ch == Dh && cw == Dw) {

        		if (min > count) {
        			min = count;
        		}
        		canClear = true;

        	} else {

        		String[][] tempMap = new String[H][W];
            	for (int h = 0; h < H; h++) {
            		for (int w = 0; w < W; w++) {
            			tempMap[h][w] = map[h][w];
            		}
            	}

            	int[] xShift = {-2, -1, 0, 1, 2};
            	int[] yShift = {-2, -1, 0, 1, 2};

            	for (int x = 0; x < xShift.length; x++) {
            		for (int y = 0; y < yShift.length; y++) {
            			if ((x == 2 && y == 2) || (x == 3 && y == 3) || (x == 3 && y == 1) || (x == 1 && y == 3) || (x == 1 && y == 1)) {
            				continue;
            			} else {
            				if (ch + xShift[x] >= 0 && ch + xShift[x] < H && cw + yShift[y] >= 0 && cw + yShift[y] < W && tempMap[ch + xShift[x]][cw + yShift[y]].equals(".")) {
            					tempMap[ch + xShift[x]][cw + yShift[y]] = "#";
            					int tempCount = count;
            					if (Math.abs(xShift[x]) > 1 || Math.abs(yShift[y]) > 1) {
            						tempCount++;
            					}
            					dps(tempMap, ch + xShift[x], cw + yShift[y], tempCount);
            				}
            			}
            		}
            	}

        	}




        }
}