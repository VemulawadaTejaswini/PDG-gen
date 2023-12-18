

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    static boolean is7(int[] ABCD, String op){
        int cul;
        cul = ABCD[0];
        for(int i=0; i<op.length(); i++) {
            if (op.charAt(i) == '+'){
                cul += ABCD[i+1]; }
                else{
                cul -= ABCD[i+1];
            }
        }
            if(cul == 7) return true;

        return false;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().trim();
        int[] ABCD = new int[str.length()];
        for(int i=0; i<str.length(); i++){
            ABCD[i] = Integer.parseInt(""+str.charAt(i));
        }
        String[] ops = {"---", "--+","-+-", "-++",
                "+--", "+-+","++-", "+++",};
        for(int i=0; i<8; i++){
            if(is7(ABCD, ops[i])){
                System.out.println(ABCD[0] +""+ ops[i].charAt(0) + ABCD[1] + ops[i].charAt(1)
                        + ABCD[2] + ops[i].charAt(2) + ABCD[3] + "=7");
                break;
            }
        }

    }
}