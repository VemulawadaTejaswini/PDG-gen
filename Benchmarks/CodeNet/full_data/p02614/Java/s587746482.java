import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int k = sc.nextInt();

        int[] p2 = {1,2,4,8,16,32,64,128};
        int sss = 0;
        String[][] c = new String[h][w] ; 
        String tmp = "";
        for(int i=0;i<h;i++){
            tmp = sc.next();
            for(int j=0;j<w;j++){
                c[i][j] = String.valueOf(tmp.charAt(j));
            }

        }

        for(int i=0;i<p2[h];i++){
            for(int j=0;j<p2[w];j++){
                String[][] aaa = new String[c.length][];
                for(int r=0; r < c.length; r++) {   //(3)
                    aaa[r] = new String[c[r].length];
                    //該当するfrom2Stringの上位配列の要素を
                    //to2Stringへコピーする。
                    System.arraycopy(c[r], 0,
                        aaa[r], 0, c[r].length);
                }
                for (int a =0;a<h;a++ ) {
                    if((p2[a] & i) != 0) {
                        for(int x =0;x<w;x++) {
                            aaa[a][x] = "r";
                        }
                    }
                }
                for (int a =0;a<w;a++ ) {
                    if((p2[a] & j) != 0) {
                        for(int x =0;x<h;x++) {
                            aaa[x][a] = "r";
                        }
                    }
                }

                int as = 0;


                for (int a =0;a<h;a++ ) {
                    for (int b =0;b<w;b++ ) {
                        System.out.print(aaa[a][b]);
                        if(aaa[a][b].equals("#")) {
                            as++;
                        }
                    }
                    System.out.print("\n");
                }
                System.out.print("\n");


                if(as == k){
                    sss++;
                }
            }
        }

        System.out.println(sss);
    }
}
