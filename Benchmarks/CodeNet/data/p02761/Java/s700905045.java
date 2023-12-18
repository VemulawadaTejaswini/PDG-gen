public class Main {

    static java.util.Scanner scan = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        boolean flg = false;
        int[] first = getLineInts();
        int[] keta = new int[first[0]];
        for(int i = 0;i<keta.length;i++){
            keta[i] = -1;
        }
        int[] var;
        for(int i=0;i<first[1];i++){
            var = getLineInts();
            if((keta[var[0]-1] == var[1]) || keta[var[0]-1] == -1){
                keta[var[0]-1] = var[1];
            }else{
                flg = true;
            }

        }
        if(flg){
            System.out.println("-1");
        }else {
            StringBuilder sb = new StringBuilder();
            boolean f = true;
            if(keta[0] == -1){
                keta[0] = 1;
            }
            for(int i = 0; i < keta.length;i++){
                sb.append(keta[i] == -1 ? 0 : keta[i]);
            }

            System.out.println(sb.toString() == "-1" ? "-1" : new Integer(sb.toString()));
        }
    }



//    public static void sloveA157() {
//        int[][] board = new int[3][3];
//        boolean[][] ans = new boolean[3][3];
//        boolean flag = false;
//        int i;
//        for(i=0;i<3;i++){
//            board[i] = getLineInts();
//        }
//        int[] searchObject = new int[getLineInts()[0]];
//        for(i=0;i<searchObject.length;i++){
//            searchObject[i] = getLineInts()[0];
//        }
//
//        int j,k,l;
//        for(j=0;j<3;j++){
//            for(k=0;k<3;k++){
//                for(l=0;l<searchObject.length;l++){
//                    int nowNum = board[j][k];
//                    if(nowNum == searchObject[l]){
//                        ans[j][k] = true;
//                    }
//                }
//            }
//        }
//        for(j=0;j<3;j++){
//            if((ans[j][0] == ans[j][1] == ans[j][2]) && ans[j][0]){
//                flag = true;
//            }
//        }
//
//        for(j=0;j<3;j++){
//            if((ans[0][j] == ans[1][j] == ans[2][j]) && ans[2][j]){
//                flag = true;
//            }
//        }
//
//        System.out.println(flag ? "Yes":"No");
//
//
//
//    }

    public static int[] getLineInts(){
        return java.util.stream.Stream.of(getLine()).mapToInt(Integer::parseInt).toArray();
    }

    public static String[] getLine(){
        return scan.nextLine().split(" ");
    }
}
