
import java.util.Scanner;

/**
 *
 * @author bhatti
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = String.valueOf(sc.nextInt());
        int K = sc.nextInt();
        boolean[] blacklist = new boolean[] { true, true, true , true, true,
                   true, true, true , true, true };
        
        for(int i = 0 ; i < K ; ++i){
            int d = sc.nextInt();
            blacklist[d] = false;
        }
        
        StringBuilder builder = new StringBuilder(N);
        for(int j = 0; j < builder.length(); ++j){
            int value = Integer.valueOf(builder.substring(j, j + 1) ).intValue();
            if( ! blacklist[value]  ){
                builder.setCharAt(j, String.valueOf(getNext(blacklist, value)).charAt(0));
            }
        }       
        System.out.println(builder.toString());
    }
    
    private static int getNext(boolean [] source, int current){
        int  i = current ;
        while(source[i] == false){
            i++;
        }
        return i;
    }
}
