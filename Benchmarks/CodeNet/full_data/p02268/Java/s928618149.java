import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        int count;
        int[] array1;
        int[] array2;
        int[] array3;
        int flag = 0;

        try{
            Scanner scan = new Scanner(System.in);
            String str = scan.next();

            count = Integer.parseInt(str);

            if(count > 10000){
                throw new Exception("ERROE");
            }
            array1 = new int[count];
            array3 = new int[count];

            for(int i = 0; i < array1.length; i++){
                str = scan.next();
                array1[i] = Integer.parseInt(str);
            }

            str = scan.next();
            count = Integer.parseInt(str);

            if(count > 500){
                throw new Exception("ERROE");
            }
            array2 = new int[count];
            for(int i = 0; i < array2.length; i++){
                str = scan.next();
                array2[i] = Integer.parseInt(str);
            }


            //配列の確認部分
            // for(int i = 0; i < array1.length; i++){
            //     System.out.print(array1[i] + " ");
            // }
            // System.out.println();
            // for(int i = 0; i < array2.length; i++){
            //     System.out.print(array2[i] + " ");
            // }
            // System.out.println();

            count = 0;
            for(int i = 0; i < array2.length; i++){
                for(int j = 0; j < array1.length; j++){
                    flag = 0;
                    if(array2[i] == array1[j]){
                        for(int k = 0; k < count; k++){
                            if(array2[i] == array3[k]){
                                flag = -1;
                                break;
                            }
                        }
                        if(flag != -1){
                            array3[count] = array2[i];
                            count++;
                        }
                    }
                }
            }

            System.out.println(count);

        }catch(Exception e){
            System.out.println("ERROR");
        }

    }
}

