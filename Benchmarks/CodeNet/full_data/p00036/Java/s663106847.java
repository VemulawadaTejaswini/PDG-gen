import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class Main {
    static String[] map;
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        while(stdIn.hasNext()) {
            map = new String[8];
            for(int i = 0; i < 8; i++) {
                map[i] = stdIn.next();
            }
            int ans = solv();
            System.out.println(B[ans]);
        }
    }
     
    public static int solv() {
        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                CON:for(int k = 0; k < A.length; k++) {
                    if(i + A[k].length > 8) {
                        continue CON;
                    }
                    for(int l = 0; l < A[k].length; l++) {
                        if(j + A[k][0].length() > 8) {
                            continue CON;
                        }
                        if(!map[i+l].substring(j, j+A[k][0].length()).equals(A[k][l])) {
                            continue CON;
                        }
                    }
                    return k;
                }
            }
        }
        return -1;
    }
    static String[][] A = new String[][]{{"11","11"},{"1","1","1","1"},{"1111"},{"01","11","10"},{"110","011"},{"10","11","01"},{"011","110"}};
    static String[] B = new String[]{"A","B","C","D","E","F","G"};
     
     
 
     
}
