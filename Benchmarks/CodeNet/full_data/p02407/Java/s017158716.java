import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Length = sc.nextInt();
        int[] number = new int[Length];
        for(int i=0; i<Length; i++){
            number[i] = sc.nextInt();
        }
        for(int i=Length-1; i>-1; i--){
            System.out.printf("%d", number[i]);
            if(i != 0){
                System.out.printf(" ");
            }
        } 
        System.out.println();
        sc.close();
    }
}
