import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {

    //グローバル変数を定義

    public static void main(String[] args) throws IOException {
        new Main().run();
    }

    void run() {
        Scanner sc = new Scanner(System.in);
        char[] array = sc.next().toCharArray();
        char[] orgArray = sc.next().toCharArray();
        boolean check = false;

        for(int i=0; i<array.length; i++){
            char[] newArray = new char[array.length];

            for(int j=0; j<array.length; j++){
                newArray[j] = array[j];
            }

            char last = newArray[array.length-1];
            for(int j=1; j<newArray.length; j++){
                array[j] = newArray[j-1];
            }
            array[0] = last;

            check = arrayIsSame(orgArray, array);
            if(check){
                break;
            }
        }

        if(check) System.out.println("Yes");
        else System.out.println("No");
    }

    boolean arrayIsSame(char[] orgArray, char[] newArray){
        for(int i=0; i<orgArray.length; i++){
            if(orgArray[i] != newArray[i]){
                return false;
            }
        }
        return true;
    }
}
