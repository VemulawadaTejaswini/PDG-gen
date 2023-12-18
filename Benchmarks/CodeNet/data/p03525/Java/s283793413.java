import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d = new int[n];
        int[] dnum = new int[13];
        dnum[0] = 1;
        for(int i=0; i<n; i++){
            d[i] = sc.nextInt();
            dnum[d[i]]++;
        }

        for (int mnum : dnum) {
            if(mnum > 2){
                System.out.println(0);
                return;
            }
        }
        if(dnum[0] > 1 || dnum[12] > 1){
            System.out.println(0);
            return;
        }

        boolean[][] map = new boolean[13][2];
        if(dnum[0] == 1){
            map[0][0] = true;
            map[0][1] = true;
        }
        if(dnum[12] == 1){
            map[12][0] = true;
            map[12][1] = true;
        }
        boolean side = true;
        for(int i=1; i<12; i++){
            if(dnum[i] == 1){
                if(side){
                    map[i][0] = true;
                }else{
                    map[i][1] = true;
                }
                side = !side;
            }else if(dnum[i] == 2){
                map[i][0] = true;
                map[i][1] = true;
            }
        }

        int minlen = 100;
        int clen1 = 1, clen2 = 1;
            boolean state = true;

        for(int j=1; j<13; j++){
            if(map[j][0]){
                state = false;
                if(clen1 < minlen) minlen = clen1;
                clen1 = 1;
            }else{
                clen1++;
            }
        }
        state = true;
        for(int j=1; j<13; j++){
            if(map[j][1]){
                state = false;
                if(clen2 < minlen) minlen = clen2;
                clen2 = 1;
            }else{
                clen2++;
            }
        }

        if(!map[12][0] && clen1 + clen2 - 2 < minlen){
            minlen = clen1+clen2-2;
        }

        System.out.println(minlen);

    }
}