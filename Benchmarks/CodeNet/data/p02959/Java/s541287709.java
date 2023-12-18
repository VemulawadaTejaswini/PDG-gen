import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arrayA = new int[a + 1];
        int[] arrayB = new int[a];
        
        for(int i = 0; i < a + 1; i++){
            arrayA[i] = sc.nextInt();
        }
        for(int i = 0; i < a; i++){
            arrayB[i] = sc.nextInt();
        }
        
        int count = 0;
        int j = 0;
        for(int i = 0; i < a + 1; i++){
            for(; j < a; j++){
                if(i != j && i != j + 1 && i < j){
                    break;
                }else if(i != j && i != j + 1 && i > j){
                    continue;
                }
                while(arrayA[i] > 0){
                    arrayA[i]--;
                    arrayB[j]--;
                    count++;
                    System.out.println(arrayA[i] + " " + arrayB[j] + " " + count);
                    if(arrayB[j] == 0){
                        break;
                    }
                }
                if(arrayA[i] == 0 && arrayB[j] == 0){
                    j++;
                    break;
                }else if(arrayA[i] == 0){
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
