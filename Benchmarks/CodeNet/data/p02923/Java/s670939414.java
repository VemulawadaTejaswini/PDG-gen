
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
        int saltosA = 0;
        for (int i = size - 2 ; i > -1; i--) {
            if(arr[i] < arr[i+1]){
                saltosA = 0;
                break;
            }else{
                saltosA++;
                saltosM = saltosA;
            }
        }
        System.out.println(saltosM);
    }
}