import java.util.Scanner;

public class Main {
    static Scanner sc;

    static int[][] map;
    public static void main(String[] args) {
        sc = new Scanner(System.in);

        // ?????????????§???????
        map = new int[8][8];
        String a;
        for (int i=0;i<8;i++) {
            a = GetSubStringLine()[0];
            for (int j=0;j<8;j++) {
                switch (a.charAt(j)) {
                    case 'o':
                        map[i][j] = 1;
                        break;
                    case 'x':
                        map[i][j] = -1;
                        break;
                    case '.':
                        map[i][j] = 0;
                        break;
                }
            }
        }

        int turn = 1;
        int num;
        int stopCnt = 0;
        while (stopCnt < 2) {
            int[][] numMap = new int[8][8];
            boolean flg = false;
            for (int i=0;i<8;i++) {
                for (int j=0;j<8;j++) {
                    if (map[i][j] == 0) {
                        num = GetNum(turn, i, j);
                        if (num > 0) {
                            flg = true;
                        }
                        numMap[i][j] = num;
                    }
                }
            }
            if (flg) {
                System.out.println("!");
                // ?????§??°????±???????
                int max = 0, mY=0,mX=0;
                if (turn == 1) {
                    for (int i=0;i<8;i++) {
                        for (int j=0;j<8;j++) {
                            if (max < numMap[i][j]) {
                                max = numMap[i][j];
                                mY = i;
                                mX = j;
                            }
                        }
                    }
                } else {
                    for (int i=7;i>=0;i--) {
                        for (int j=7;j>=0;j--) {
                            if (max < numMap[i][j]) {
                                max = numMap[i][j];
                                mY = i;
                                mX = j;
                            }
                        }
                    }
                }
                RevNum(turn, mY, mX);
                map[mY][mX] = turn;
                System.out.println("Puts:turn:"+turn+":"+mY+","+mX);
                for (int i=0;i<8;i++) {
                    for (int j=0;j<8 ;j++) {
                        switch (map[i][j]) {
                            case 1:
                                System.out.print('o');
                                break;
                            case -1:
                                System.out.print('x');
                                break;
                            case 0:
                                System.out.print('.');
                                break;
                        }
                    }
                    System.out.println("");
                }
            } else {
                stopCnt++;
            }
            turn *= -1;
        }
        for (int i=0;i<8;i++) {
            for (int j=0;j<8 ;j++) {
                switch (map[i][j]) {
                    case 1:
                        System.out.print('o');
                        break;
                    case -1:
                        System.out.print('x');
                        break;
                    case 0:
                        System.out.print('.');
                        break;
                }
            }
            System.out.println("");
        }
    }

    static public int GetNum(int a, int y, int x) {
        int sum = 0;
        for (int i=-1;i<2;i++) {
            for (int j=-1;j<2;j++) {
                if (i!=0||j!=0) {
                    sum += GetLineNu(a, i, j, y, x);
                }
            }
        }
        return sum;
    }

    static int GetLineNu(int a, int dy, int dx, int y, int x) {
        int sum = 0;
        y+=dy;
        x+=dx;
        for (int cnt=0;cnt<8;cnt++, y+=dy,x+=dx) {
            if (y < 0 || x < 0 || y > 7 || x > 7) {
                return 0;
            }
            if(map[y][x] == -a) {
                sum++;
            } else if (map[y][x] == a) {
                return sum;
            } else {
                return 0;
            }
        }
        return 0;
    }

    static public void RevNum(int a, int y, int x) {
        for (int i=-1;i<2;i++) {
            for (int j=-1;j<2;j++) {
                if (i!=0||j!=0) {
                    RevLineNu(a, i, j, y, x);
                }
            }
        }
    }

    static void RevLineNu(int a, int dy, int dx, int y, int x) {
        int y1 = y, x1 = x;
        y+=dy;
        x+=dx;
        for (int cnt=0;cnt<8;cnt++, y+=dy,x+=dx) {
            if (y < 0 || x < 0 || y > 7 || x > 7) {
                return;
            }
            if(map[y][x] == -a) {
            } else if (map[y][x] == a) {
                break;
            } else {
                return;
            }
        }
        for (int cnt=0;cnt<8;cnt++, y-=dy,x-=dx) {
            if (y == y1 && x == x1) {
                return;
            }
            map[y][x] = a;
        }
    }

    public static String[] GetSubStringLine() {
        String s = sc.nextLine();
        return s.split(" ");
    }
}