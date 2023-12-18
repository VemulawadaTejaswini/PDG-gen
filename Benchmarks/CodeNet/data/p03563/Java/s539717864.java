import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double r = sc.nextInt();
        double g = sc.nextInt();

        System.out.println((int)(2*g - r));
    }

    public static void printArray(int[] array){
        for(int i=0; i<array.length; i++){
            if(i == array.length){
                System.out.println(array[i]);
            } else {
                System.out.print(String.format("%d ", array[i]));
            }
        }
    }
}
