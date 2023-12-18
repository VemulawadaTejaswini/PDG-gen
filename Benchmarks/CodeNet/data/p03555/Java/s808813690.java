import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[][] tmp = new String[2][3];
        tmp[0] = sc.next().split("");
        tmp[1] = sc.next().split("");
        String strTmp = null;

        // tmp[0] = "pot".split("");
        // tmp[1] = "pot".split("");

        String[][] answer = tmp;
        int tmpLen = tmp[0].length;
        int count = tmpLen - 1;

        for (int i = 0 ; i < tmpLen ; i++ ) {
            strTmp = tmp[1][count];
            tmp[1][count] = tmp[0][i];
            tmp[0][i] = strTmp;
            count --;
        }
        boolean swt = true;
        for (int i = 0 ; i < tmp.length ; i ++ ) {
            for (int j = 0 ; j < tmp[i].length ; j++ ) {
                if (!(tmp[i][j].equals(answer[i][j]))) {
                    swt = false;
                }
            }
        }

        if (swt) {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }
}
