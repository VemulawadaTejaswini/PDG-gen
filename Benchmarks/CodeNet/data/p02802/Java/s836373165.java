import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] p = new int[m];
        String[] s = new String[m];
        for(int i = 0; i < m; i++){
            p[i] = scan.nextInt();
            s[i] = scan.next();
        }
        boolean[] isAc = new boolean[n];
        int cac = 0;
        int cwa = 0;
        for(int i = 0; i < m; i++){
            if(s[i].equals("AC") && !isAc[p[i] - 1]){
                isAc[p[i] - 1] = true;
                cac++;
            }else if(!isAc[p[i] - 1]){
                cwa++;
            }
        }
        System.out.println(cac + " " + cwa);
        scan.close();
    }
}
