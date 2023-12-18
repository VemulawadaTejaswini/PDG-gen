import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] S = sc.next().toCharArray();

        sc.close();

        boolean YYMM = true;
        boolean MMYY = true;

        if(S[0] == '0'){
            if(S[1] == '0'){
                MMYY = false;
            }
        }else if(S[0] == '1'){
            if(S[1] != '0' && S[1] != '1' && S[1] != '2'){
                MMYY = false;
            }
        }else{
            MMYY = false;
        }

        if(S[2] == '0'){
            if(S[3] == '0'){
                YYMM = false;
            }
        }else if(S[2] == '1'){
            if(S[3] != '0' && S[3] != '1' && S[3] != '2'){
                YYMM = false;
            }
        }else{
            YYMM = false;
        }

        String result = null;

        if(YYMM && MMYY){
            result = "AMBIGUOUS";
        }else if(YYMM && !MMYY){
            result = "YYMM";
        }else if(!YYMM && MMYY){
            result = "MMYY";
        }else{
            result = "NA";
        }

        System.out.println(result);

    }
}
