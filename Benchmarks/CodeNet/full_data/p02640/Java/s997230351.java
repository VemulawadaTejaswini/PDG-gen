import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int l = sc.nextInt();

        String ans = "No";

        for (int i = 0; i<(a+1); i++){
            for (int j = 0; j<(a+1); j++){
                if ((i+j) == a){
                    if ( (i*2)+(j*4) == l ){
                        ans = "Yes";
                    }
                }
            }
        }

        System.out.println(ans);
    }
}