import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int D = scn.nextInt();
        long[] c = new long[26];
        long[][] s = new long[D][26];
        int cNum = 0;
        int[] ld = new int[26];
        Arrays.fill(ld,0);

        for(int i=0;i<26;i++){
            c[i]=scn.nextLong();
        }

        for(int i=0;i<D;i++){
            long cCheck = 0;

            for(int j=0;j<26;j++){
                if((i-ld[j])*c[j]>cCheck){
                    cCheck=(i-ld[j])*c[j];
                    cNum = j;
                }
            }
            ld[cNum]=i;
            System.out.println(cNum+1);

        }


        scn.close();

    }


}
