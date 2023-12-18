import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a*a-b);
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
