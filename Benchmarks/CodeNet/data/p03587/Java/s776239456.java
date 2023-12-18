

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by kennzya on 2017/09/30.
 */
public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        String[] input = sc.next().split("");
        for(int i = 0;i < 6;i++){
            System.out.println(input[i]);
            if(input[i].equals("1")){
                result++;
            }
        }
        System.out.println(result);
    }
}
