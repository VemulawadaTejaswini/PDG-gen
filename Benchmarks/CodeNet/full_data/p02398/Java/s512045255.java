
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        ArrayList<Integer> list = new ArrayList<Integer>();

        if(a <= b){
            for(int i = a; i < (b+1); i++){
                if(c%i == 0){
                    list.add(i);
                }
            }
        }
        System.out.println(list.size());

    }
}

