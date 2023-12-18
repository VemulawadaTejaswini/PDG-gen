import java.io.*;
import java.util.*;
import java.lang.String;
import java.util.Arrays;

import static java.lang.Integer.*;

public class Main extends PrintWriter {
    Main() { super(System.out, true); }
    Scanner sc = new Scanner(System.in);
    public static void main(String[] $) {
        Main o = new Main(); o.main(); o.flush();
    }
    //took bsearch from Dukkha
    private static int binSearch(Integer[] arr, int number){
        int left=0,right=arr.length-1,mid=(left+right)/2,ind=0;
        while(left<=right){
            if(arr[mid]<=number){
                ind=mid+1;
                left=mid+1;
            }
            else
                right=mid-1;
            mid=(left+right)/2;
        }
        return ind;
    }

    void main() {

       int a = sc.nextInt();
       int b = sc.nextInt();
       int c = sc.nextInt();

       print(c + " " + a + " " + b);    

    }
}