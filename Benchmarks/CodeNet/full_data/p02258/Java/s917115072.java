import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt(), min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for(int i = 0; i < size; i++){
            int val = scan.nextInt();
            if(max < val - min) max = val - min;
            if(val < min) min = val;
        }
        System.out.println(max);
    }
}