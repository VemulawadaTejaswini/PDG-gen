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

        int ng=-1,ok=N-1;
        while( Math.abs(ng-ok) > 1){
            int mid = (ng+ok)/2;
            if(isOKLeft(mid,spells,s)){
                ok = mid;
            }else{
                ng = mid;
            }
        }

        int leftOK = ok;

        ng=N;ok=0;
        while( Math.abs(ng-ok) > 1){
            int mid = (ng+ok)/2;
            if(isOKRight(mid,spells,s)){
                ok = mid;
            }else{
                ng = mid;
            }
        }

        int rightOK = ok;


        System.out.println(rightOK-leftOK+1);
    }


    static    boolean isOKLeft(int mid,char[][] spells ,char[] s){
        for (int i = 0; i < spells.length; i++) {
            if(spells[i][0] == s[mid]){
                if(spells[i][1]=='L'){
                    mid--;
                }else{
                    mid++;
                }
                if(mid ==-1) {
                    return false;
                }
            }
        }
        return true;
    }

    static    boolean isOKRight(int mid,char[][] spells ,char[] s){
        for (int i = 0; i < spells.length; i++) {
            if(spells[i][0] == s[mid]){
                if(spells[i][1]=='L'){
                    mid--;
                }else{
                    mid++;
                }
                if(mid ==s.length) {
                    return false;
                }
            }
        }
        return true;
    }


    static    boolean isOK(int mid,char[][] spells ,char[] s, int drop ){
        for (int i = 0; i < spells.length; i++) {
            if(spells[i][0] == s[mid]){
                if(spells[i][1]=='L'){
                    mid--;
                }else{
                    mid++;
                }
                if(mid ==drop) {
                    return false;
                }
            }
        }
        return true;
    }

}