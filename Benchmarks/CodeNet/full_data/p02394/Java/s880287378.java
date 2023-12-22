import java.util.*;

public class Main{
    public static void main(String[] args){
        System.out.println(Main.isIn());
    }

    public static String isIn(){
        int[] array = new int[5];
        Scanner scan = new Scanner(System.in);
        for(int i=0; i < 5; i++){
            array[i] = scan.nextInt();
        }
        boolean boolX = array[4] <= array[2] && array[2] + array[4] <= array[0];
        boolean boolY = array[4] <= array[3] && array[4] + array[3] <= array[1];
        if (boolX && boolY){
            return "Yes";
        }
        else{
            return "No";
        }
    }
} 

