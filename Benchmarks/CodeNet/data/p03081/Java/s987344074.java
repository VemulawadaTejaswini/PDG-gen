import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int Q = sc.nextInt();
        char[] s = sc.next().toCharArray();
        char[][] spells = new char[Q][2];
        for (int i = 0; i < Q; i++) {
            spells[i][0] = sc.next().charAt(0);
            spells[i][1] = sc.next().charAt(0);
        }

        int ng=-1,ok=N;
        while( Math.abs(ng-ok) > 1){
            int mid = (ng+ok)/2;
            if(isOK(mid,spells,s) ==-1){
                ng = mid;
            }else{
                ok = mid;
            }
        }

        int leftOK = ok;

        ng=N;ok=-1;
        while( Math.abs(ng-ok) > 1){
            int mid = (ng+ok)/2;
            if(isOK(mid,spells,s) == 1){
                ng = mid;
            }else{
                ok = mid;
            }
        }

        int rightOK = N-1-ok;


        System.out.println( N - rightOK-leftOK);
    }

static    int isOK(int mid,char[][] spells ,char[] s ){
        for (int i = 0; i < spells.length; i++) {
            if(spells[i][0] == s[mid]){
                if(spells[i][1]=='L'){
                    mid--;
                }else{
                    mid++;
                }
                if(mid == -1) {
                    return -1;
                }
                if(mid == s.length) {
                    return 1;
                }
            }
        }
        return 0;
    }

}
