
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Ent = new Scanner(System.in);
        int size = Ent.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] =  Ent.nextInt();
        }
        int saltosM = 0;
        for (int i = 0; i < size; i++) {
            int saltosA = 0;
            for (int j = i+1; j < size; j++) {
                if(arr[j] > arr[j-1]){
                    break;
                }else{
                    saltosA++;
                }
            }
            if(saltosA> saltosM){
                saltosM = saltosA;
            }
        }
        System.out.println(saltosM);
    }
}