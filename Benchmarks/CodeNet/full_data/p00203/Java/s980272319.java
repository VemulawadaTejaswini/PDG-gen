import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static int X, Y;
    static int[][] field, dp;
    public static void main(String[] args) {
        while(read()){
            solve();
        }

    }
    static boolean read(){
        X = sc.nextInt(); Y = sc.nextInt();
        if(X == 0 && Y == 0)return false;

        field = new int[Y][X];
        dp = new int[Y][X];

        for(int i = 0; i < Y; i++){
            for(int j = 0; j < X; j++){
                field[i][j] = sc.nextInt();
            }
        }
        return true;
    }
    static void solve(){
        //cÆ¡
        int height = field.length;
        int width = field[0].length;
        int res = 0;
        //dpÌú»
        for(int i = 0; i < height; i++){
            if(field[0][i] == 0){
                dp[0][i] = 1;
            }
        }

        for(int i = 1; i < height; i++){
            for(int j = 0; j < width; j++){
                if(field[i][j] == 0){
                    /*
                     * }XÚªOÈçãÌRÂ©çlðàç¤B
                     * ½¾µAãÌ}XàOÅ éKvª éB
                     */
                    if( 0 <= j-1 && j-1 < width && field[i-1][j-1] == 0)dp[i][j] += dp[i-1][j-1];

                    if( field[i-1][j] == 0 )dp[i][j] += dp[i-1][j];

                    if( 0 <= j+1 && j+1 < width && field[i-1][j+1] == 0)dp[i][j] += dp[i-1][j+1];
                }else if(field[i][j] == 2){
                    /*
                     * }XÚªQÈçWväÈÌÅ^ã©çàç¤B
                     * »µÄAQÂºÉ«ÞB
                     * ½¾µAÍÍOÉÈéêª éÌÅA»ÌÍêÔºÉ¢Ä¨­
                     */
                    dp[i][j] += dp[i-1][j];
                    if(i+2 < height){
                        dp[i+2][j] += dp[i][j];
                    }else{
                        res += dp[i][j];
                    }

                }else{
                    /*
                     * }XÚªPÈçØÈÌÅA½àÈ¢B
                     */
                    dp[i][j] = 0;
                }
            }

        }//dpe[uXVÌI¹

        for(int i = 0; i < width; i++){
            res += dp[height-1][i];
        }
        System.out.println(res);
    }
}