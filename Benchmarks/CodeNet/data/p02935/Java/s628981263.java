import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static boolean debug = true;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        LinkedList<Integer> list = new LinkedList();
        for(int i=0; i<n; i++){
            list.add(sc.nextInt());
        }

        Collections.sort(list);

        double temp = 0;
        for(int i=0; i<list.size();i++){
            if(temp ==0){
                temp = list.get(i);
            }
            temp = (list.get(i) + temp )/2;
        }

        System.out.println(temp);


    }
    public static void d(String message){
        if(debug){
            System.out.println(message);
        }
    }
}
