import java.util.*;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner scanIn = new Scanner(System.in);
        int l = scanIn.nextInt();
        int n = scanIn.nextInt();

        String[] stringArray = new String[l];

        for(int i = 0; i < n; i++){
            stringArray[i] = scanIn.next();
        }
        Arrays.sort(stringArray);

        System.out.println(Arrays.toString(stringArray).replaceAll("\\[|\\]|,",""));
    }
}
