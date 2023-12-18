import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int px;
        int result;
        ArrayList inputList = new ArrayList<Integer>();

        for(int i=0; i<N; i++){
            px = Math.abs(sc.nextInt() - X);
            inputList.add(px);
        }
        Collections.sort(inputList, Comparator.reverseOrder());
        result = (int) inputList.get(0);

        for(int i=1; i<inputList.size(); i++){
            result = gcd(result, (int) inputList.get(i));

        }

        System.out.println(result);
    }
    static int gcd(int x, int y){
        if(x%y == 0) {
            return y;
        }
        return gcd(y,x%y);
    }


}