import java.util.ArrayList;
import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean state = true;
        ArrayList<Integer> list = new ArrayList<Integer>();

        while (state) {
            int input = scanner.nextInt();
            if ( input != 0) list.add(input);
            else state = false;
        }

        for (int i=0;i<list.size();i++){
            System.out.println("Case "+ (i+1) + ": " + list.get(i));
        }

    }
}
