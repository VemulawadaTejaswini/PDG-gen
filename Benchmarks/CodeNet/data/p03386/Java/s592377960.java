import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int K = sc.nextInt();
        ArrayList<Integer> list = new ArrayList();
        for (int i =A ; i < A+ K ; i++){
            if (i > B){
                break;
            }
            list.add(i);
        }
        for (int i = B; i > B -K ; i--){
            if (i < A){
                break;
            }
            if (list.contains(i)){

            }else{
                list.add(i);
            }
        }
        Collections.sort(list);
        for (Integer i : list){
            System.out.println(i);
        }
    }
}