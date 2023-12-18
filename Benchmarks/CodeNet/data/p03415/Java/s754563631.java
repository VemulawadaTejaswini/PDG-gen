import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char a = sc.next().toCharArray()[0];
        char b = sc.next().toCharArray()[1];
        char c = sc.next().toCharArray()[2];
        String abc = String.valueOf(a) + String.valueOf(b) + String.valueOf(c);
        System.out.println(abc);
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
