import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    private static void nCombination3(int c) {
        int count = c;
        int num = 0;
        for (int i = 0; i < count - 2; i++) {
            for (int j = i + 1; j < count - 1; j++) {
                for (int k = j + 1; k < count; k++) {
                    num++;
                }
            }
        }
    }



    public static void main(String[] args) {
        // write your code here
        Scanner sc=new Scanner(System.in);
        double X=sc.nextDouble();
        boolean flag = false;
        long temp = 100;
        for(int i=1;i<=100000;i++){
            temp *= 1.01;
            if(temp>=X){
                System.out.println(i);
                break;
            }
        }





    }
}
