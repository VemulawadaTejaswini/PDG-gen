import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        int count;
        int[] array = new int[2];
        int key = 0;

        try{
            Scanner scan = new Scanner(System.in);

            String str = scan.next();
            array[0] = Integer.parseInt(str);

            str = scan.next();
            array[1] = Integer.parseInt(str);

            //System.out.println(array[0] + " " + array[1]);


            if(array[0] < array[1]){
                key = array[0];
                array[0] = array[1];
                array[1] = key;
            }


            key = array[0] % array[1];
            while(true){
                if(key == 0){
                    break;
                }
                array[0] = array[1];
                array[1] = key;
                key = array[0] % array[1];
            }
            // for(int i = 0; i < array[0]; i++){
            //     if(i == 0){
            //         continue;
            //     }else{
            //         if(array[0] % i == 0 && array[1] % i == 0){
            //             key = i;
            //         }
            //     }
            // }

            System.out.println(array[1]);

        }catch(Exception e){
            System.out.println("ERROR");
        }

    }
}
