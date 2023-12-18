import java.util.*;
import java.io.*;

public class Main {

    private static int solver(String str){
        int oddZero = 0;
        int oddOne = 0;
        int evenZero = 0;
        int evenOne = 0;
        for(int i=0; i<str.length();i++){
            if(i%2 == 1) {
                if(str.charAt(i) == '0'){
                    oddZero++;
                }else{
                    oddOne++;
                }
            }else{
                if(str.charAt(i) == '0'){
                    evenZero++;
                }else{
                    evenOne++;
                }
            }
        }

        return Math.min(oddZero + evenOne, oddOne + evenZero);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        System.out.println(solver(in.next()));
    }
}
