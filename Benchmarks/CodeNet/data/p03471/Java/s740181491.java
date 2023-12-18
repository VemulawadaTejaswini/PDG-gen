import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        /**           入力                    **/
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //キー入力を取得
        String line = br.readLine();//1列目を取得
        String aInput[] = null;
        aInput = line.split(" ");
        //デバッグ
//        for(String aTxt : aInput) {
//          System.out.println(aTxt);
//        }
        
        /********** ここから問題 ********/
        /**           定数                    **/
        int nN = Integer.parseInt(aInput[0]);
        int nY = Integer.parseInt(aInput[1])/1000;

        final int Cst1000 = 1;
        final int Cst5000 = 5;
        final int Cst10000 = 10;
        
        /**           変数                    **/
        int nAns1000  = 0;
        int nAns5000  = 0;
        int nAns10000 = 0;
        boolean bEnd = false;
        
        /**           処理                    **/
        for(int nLp10 = 0; nLp10 <= nN; nLp10++) {
            for(int nLp5 = 0; nLp5 <= nN; nLp5++) {
                for(int nLp1 = 0; nLp1 <= nN; nLp1++) {
            if(nLp1 + nLp5 + nLp10 == nN && nLp1 * Cst1000 + nLp5 * Cst5000 + nLp10 * Cst10000 == nY) {
                nAns1000  = nLp1;
                nAns5000  = nLp5;
                nAns10000 = nLp10;
                bEnd = true;
                break;
            }
            if( (nN) * Cst10000 < nY) {
                bEnd = false;
                break;
            }
        }
            }
        }
        
        
        /**           出力                    **/
        if(bEnd) {
          System.out.println(nAns10000 + " " + nAns5000 + " " + nAns1000);
        } else {
          System.out.println("-1 -1 -1");
        }
    }
}
