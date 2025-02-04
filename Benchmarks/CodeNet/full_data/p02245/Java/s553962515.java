import java.util.Scanner;

/**
 * IDA*?±??§£15puzzle????¢?
 * IDA*??´??????IDDFS???A*???????????¶???IDDFS??§??¶????±??§£????¨??????????????????????A*???????????????"?????????"????´¢???
 * IDA*?????\????§£????????£??±??????A*???????????¶????????????"??±???"?????????????¢?????§£???"????????????"???
 * ???"????????????"???????????£?¢????????£???????????????¨"????????????"??????????????°???????§£?????????????????????????°±??§????????£???
 * ?????????A*???????????????????????????????????¨?????±????????¨???IDDFS????????\???IDA*?????±?????????????´¢?????????????????????????????¨???
 * @author wly
 * @date 2013-12-20
 *
 */
public class Main {

    //????????£??¨????????????????????????????§???¨?????????????????°
    private int[] up = {-1,0};
    private int[] down = {1,0};
    private int[] left = {0,-1};
    private int[] right = {0,1};

    /**??¨????????????UP???DOWN???LEFT???RIGHT??????????????????????????????????????¢??£???????????¨
     * ((dPrev != dCurr) && (dPrev%2 == dCurr%2))
     * ??\???????????????????§???¨??????????????????
     */
    private final int UP = 0;
    private final int DOWN = 2;
    private final int LEFT = 1;
    private final int RIGHT = 3;

    private int SIZE;

    //?????????????????????
    private int[][] targetPoints;

    //??¨?????°????§???¨??\???????????¨0,1,2,3,???????????????????????????
    private static int[] moves = new int[100000];

    private static long ans = 0;; //???????????£???"????????£???"

    //????????¶???
    private static int[][] tState = {
            {1 ,2 ,3  } ,
            {4 ,5 ,6  } ,
            {7 ,8, 0  }

    };

    private static int[][] sState;


    private static int blank_row,blank_column;

    public Main(int[][] state) {
        SIZE = state.length;
        targetPoints = new int[SIZE * SIZE][2];

        this.sState = state;
        //?????°????????????
        for(int i=0;i<state.length;i++) {
            for(int j=0;j<state[i].length;j++) {
                if(state[i][j] == 0) {
                    blank_row = i;
                    blank_column = j;
                    break;
                }
            }
        }

        //?????°?????????????????°???
        for(int i=0;i<state.length;i++) {
            for(int j=0;j<state.length;j++) {
                targetPoints[tState[i][j]][0] = i; //?????????

                targetPoints[tState[i][j]][1] = j; //?????????
            }
        }
    }

    public static void main(String[] args) {
        int step = 0;
        int[][] sState=new int[3][3];
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String s;
        while(count<3){
            s = sc.nextLine();
            sState[count][0] = Integer.parseInt(s.split(" ")[0]);
            sState[count][1] = Integer.parseInt(s.split(" ")[1]);
            sState[count][2] = Integer.parseInt(s.split(" ")[2]);
            count++;
        }

        Main idaAlgorithm = new Main(sState);
            //??\??????????????????????§?????°???£?????°
            int j = idaAlgorithm.getHeuristic(sState);
            int i = -1;//?????????????§???¨??????
            //?????£?????±"????°???£?????°"
            for(ans=j;;ans++) {
                if(idaAlgorithm.solve(sState
                        ,blank_row,blank_column,0,i,j)) {
                    break;
                }
            }
            int[][] matrix = idaAlgorithm.move(sState,moves[0]);
            step ++;
            for(int k=1;k<ans;k++) {
                matrix = idaAlgorithm.move(matrix, moves[k]);
                step ++;
            }
            System.out.println(step);
    }

    public int[][] move(int[][]state,int direction) {
        int row = 0;
        int column = 0;
        for(int i=0;i<state.length;i++) {
            for(int j=0;j<state.length;j++) {
                if(state[i][j] == 0) {
                    row = i;
                    column = j;
                }
            }
        }
        switch(direction) {
            case UP:
                state[row][column] = state[row-1][column];
                state[row-1][column] = 0;
                break;
            case DOWN:
                state[row][column] = state[row+1][column];
                state[row+1][column] = 0;
                break;
            case LEFT:
                state[row][column] = state[row][column-1];
                state[row][column-1] = 0;
                break;
            case RIGHT:
                state[row][column] = state[row][column+1];
                state[row][column+1] = 0;
                break;
        }
        return state;
    }


    /**
     * ?±??§£??????
     * @param state ????????¶???
     * @param blank_row ??????????????????
     * @param blank_column ??????????????????
     * @param dep ????????±???
     * @param d ???????¬??§???¨?????????
     * @param h ????????¶?????°????????°
     * @return
     */
    public boolean solve(int[][] state,int blank_row,int blank_column,
                         int dep,long d,long h) {

        long h1;

        //???????????????????????????????????????????????????????????¨???????¢?????§£
        boolean isSolved = true;
        for(int i=0;i<SIZE;i++) {
            for(int j=0;j<SIZE;j++) {
                if(state[i][j] != tState[i][j]) {
                    isSolved = false;
                }
            }
        }
        if(isSolved) {
            return true;
        }

        if(dep == ans) {
            return false;
        }

        //??¨?????¨???"??????"?§???¨??????????????????
        int blank_row1 = blank_row;
        int blank_column1  = blank_column;
        int[][] state2 = new int[SIZE][SIZE];

        for(int direction=0;direction<4;direction++) {
            for(int i=0;i<state.length;i++) {
                for(int j=0;j<state.length;j++) {
                    state2[i][j] = state[i][j];
                }
            }

            //??¬??°?§???¨?????????????¬??§???¨??????????\????????????????????§????????????¨???
            if(direction != d && (d%2 == direction%2)) {
                continue;
            }

            if(direction == UP) {
                blank_row1 = blank_row + up[0];
                blank_column1 = blank_column + up[1];
            } else if(direction == DOWN) {
                blank_row1 = blank_row + down[0];
                blank_column1 = blank_column + down[1];
            } else if(direction == LEFT) {
                blank_row1 = blank_row + left[0];
                blank_column1 = blank_column + left[1];
            } else {
                blank_row1 = blank_row + right[0];
                blank_column1 = blank_column + right[1];
            }

            //???????£???\
            if(blank_column1 < 0 || blank_column1 == SIZE
                    || blank_row1 < 0 || blank_row1 == SIZE) {
                continue ;
            }

            //?????¢??????????????????????§???¨????????????????????????
            state2[blank_row][blank_column] = state2[blank_row1][blank_column1];
            state2[blank_row1][blank_column1] = 0;

            //??\???????????????????????£??¨???????????????
            if(direction == DOWN && blank_row1
                    > targetPoints[state[blank_row1][blank_column1]][0]) {
                h1 = h - 1;
            } else if(direction == UP && blank_row1
                    < targetPoints[state[blank_row1][blank_column1]][0]){
                h1 = h - 1;
            } else if(direction == RIGHT && blank_column1
                    > targetPoints[state[blank_row1][blank_column1]][1]) {
                h1 = h - 1;
            } else if(direction == LEFT && blank_column1
                    < targetPoints[state[blank_row1][blank_column1]][1]) {
                h1 = h - 1;
            } else {
                //????§???????????????¨????????????????§???¨????????????????????°????????°????????§
                h1 = h + 1;
            }

            if(h1+dep+1>ans) { //??????
                continue;
            }

            moves[dep] = direction;

            //?????£??±????±??§£
            if(solve(state2, blank_row1, blank_column1, dep+1, direction, h1)) {
                return true;
            }
        }
        return false;
    }

    /**
     * ?????°??°????????°???
     */
    public int getHeuristic(int[][] state) {
        int heuristic = 0;
        for(int i=0;i<state.length;i++) {
            for(int j=0;j<state[i].length;j++) {
                if(state[i][j] != 0) {
                    heuristic = heuristic +
                            Math.abs(targetPoints[state[i][j]][0] - i)
                            + Math.abs(targetPoints[state[i][j]][1] - j);

                }
            }
        }
        return heuristic;
    }
}