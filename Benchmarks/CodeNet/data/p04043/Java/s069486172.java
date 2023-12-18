import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[] n = sc.nextLine().toCharArray();
        int count = 0;
        int seven = 0;
        for(char c: n){
            if(c == '5'){
                count++;
            }
            if(c == '7'){
                seven++;
            }
        }
        if(count == 2 && seven == 1){
            System.out.println("YES");
        } else {
            System.out.println("NO");

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
