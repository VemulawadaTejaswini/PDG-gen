//import java.util.*;
//import java.io.*;
//
//class Main {
//    public static String LongestWord(String sen) {
//
//        char[] a= sen.toCharArray();
//        int k1=0,  temp, len=0;
//        for(int i=0; i< a.length; i++){
//            if("a[i]" != " " && ((a[i] >= 65 && a[i]<= (char)90) || (a[i] >= (char)97 && a[i]<= (char)122)) ){
//                k1++;
//
//            }
//            else{
//                if(k1 > len ){
//                    len = k1;
//                    temp= i;
//                }
//            }
//        }
//        String sent;
//        for(int i= temp-len-1; i<temp; i++ ){
//            sent = a[i];
//        }
//
//        return sent;
//
//    }
//
//    public static void main (String[] args) {
//        // keep this function call here
//        Scanner s = new Scanner(System.in);
//        System.out.print(LongestWord(s.nextLine()));
//    }
//
//}
//
package com.company;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

class Syllabus
{
    public static void main(String[] arg)
    {
        Scanner scan = new Scanner(System.in);
        String S = scan.next();
        char[] a= S.toCharArray();
        boolean flag = true;
        for (int i = 0; i < S.length(); i++) {

            if(i%2 == 0 && (a[i] == 'R' || a[i] == 'U' || a[i] == 'D')) {
                continue;
            }
            else if(i%2 == 1 && (a[i] == 'L' || a[i] == 'U' || a[i] == 'D')){
                continue;
            }

            else {
               
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

    }
}
