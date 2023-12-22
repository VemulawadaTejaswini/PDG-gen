import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        int count;
        int[] array = new int[100];
        int key;
        int mini = 0;
        int counter = 0;

        try{
            Scanner scan = new Scanner(System.in);
            String str = scan.next();

            count = Integer.parseInt(str);

            for(int i = 0; i < count; i++){
                str = scan.next();
                array[i] = Integer.parseInt(str);
            }

            //Sort Part
            for(int i = 0; i < count - 1; i++){
                mini = i;
                for(int j = i; j < count; j++){
                    if(array[j] < array[mini]){
                        mini = j;
                    }
                    // key = array[mini];
                    // array[mini] = array[i];
                    // array[i] = key;
                }
                if(mini != i){
                    key = array[mini];
                    array[mini] = array[i];
                    array[i] = key;
                    counter++;
                }
            }

            for(int i = 0; i < count; i++){
                if(i == count - 1){
                    System.out.println(array[i]);
                }else{
                    System.out.print(array[i] + " ");
                }
            }

            System.out.println(counter);

        }catch(Exception e){
            System.out.println("ERROR");
        }

    }
}

