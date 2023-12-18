import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[][] tmp = new String[2][3];
        tmp[0] = sc.next().split("");
        tmp[1] = sc.next().split("");

        int tmpLen = 3;

        boolean swt = false;
        for ( int i = 0 ; i < 3 ; i++ ) {
            tmpLen --;
            if (tmp[0][i].equals(tmp[1][tmpLen])) {
                swt = true;
            }else{
                swt = false;
                i = 3;
            }
        }

        if (swt) {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }




    }
}
