import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.List;
import java.util.ArrayList;

public class Main{
    public static void main(String args[]){
        List<Integer> input_int = new ArrayList<Integer>();
        int N = 0;

        try{
            Scanner intScanner = new Scanner(System.in);
            N = intScanner.nextInt();

            Scanner strScanner = new Scanner(System.in);
            String input_str[] = strScanner.nextLine().split(" ");

            for(String str : input_str){
                input_int.add(Integer.parseInt(str));
            }
            intScanner.close();
            strScanner.close();
        } catch(InputMismatchException e){
            System.out.println(e);
        }

        int oceanView = 1;
        Integer curMax = input_int.get(0);

        for(int i = 1; i < N; i++){
            if(checkIsOceanView(input_int, i, curMax)) oceanView++;
        }
        System.out.println(oceanView + "\n");
    }

    public static boolean checkIsOceanView(List<Integer> input, int cur, Integer max){
        if(input.get(cur) >= max){
            max = input.get(cur);
            return true;
        }
        else{
            return false;
        }  
    }
}
