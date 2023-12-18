import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] array = new int[a];
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < a; i++){
            array[i] = sc.nextInt();
        }
        for(int i = 1; i <= a; i++){
            for(int j = 0; j < a; j++){
                if(array[j] == i){
                    list.add(j + 1);
                    break;
                }
            }
        }
        for(int i = 0; i < a; i++){
            System.out.print(list.get(i) + " ");
        }
    }
}