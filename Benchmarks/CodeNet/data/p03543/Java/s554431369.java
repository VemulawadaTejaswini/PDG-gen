import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[] input = sc.next().toCharArray();
        int count = 1;
        for(int i=0; i<input.length; i++){
            if(i !=0 && input[i-1] == input[i]){
                count++;
            } else if(i != input.length-1){
                count = 1;
            }
        }

        if(count >= 3){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
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
