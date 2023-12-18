import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] array = new int[a];
        
        for(int i = 0; i < a; i++){
            array[i] = sc.nextInt();
        }
        for(int i = 0; i < a; i++){
            int num = 0;
            for(int j = 0; j < a; j++){
                if(j == i){
                    continue;
                }
                num = Math.max(num, array[j]);
            }
            System.out.println(num);
        }
    }
}