import java.util.*;
import java.io.*;

class Main{
    static boolean solve(int i,int m, int n, int[] array){
        boolean res;

        if(m == 0){
            return true;
        }

        if(i >= n){
            return false;
        }

        if((res = solve(i + 1, m, n, array)) == true ||
           (res = solve(i + 1, m - array[i], n, array)) == true){
            return true;
        }

        return false;
    }

    public static void main(String[] args){
        int count1;
        int count2;
        int[] array1;
        int[] array2;
        int flag = 0;

        try{
            Scanner scan = new Scanner(System.in);
            String str;

            str= scan.next();
            count1 = Integer.parseInt(str);
            array1 = new int[count1];

            for(int i = 0; i < array1.length; i++){
                str = scan.next();
                array1[i] = Integer.parseInt(str);
            }

            str = scan.next();
            count2 = Integer.parseInt(str);
            array2 = new int[count2];

            for(int i = 0; i < array2.length; i++){
                str = scan.next();
                array2[i] = Integer.parseInt(str);
            }

            for(int i = 0; i < array2.length; i++){
                if(solve(0, array2[i], array1.length, array1) == true){
                    System.out.println("yes");
                }else{
                    System.out.println("no");
                }
            }

        }catch(Exception e){
            System.out.println("ERROR");
        }

    }
}

