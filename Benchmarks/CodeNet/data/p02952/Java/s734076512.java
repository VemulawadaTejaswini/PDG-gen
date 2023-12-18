import java.util.*;

public class Main{

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        Integer N = Integer.parseInt(scan.next());

        int counter = 0;

        for(int i=1;i<=N;i++){
            if(String.valueOf(i).length() % 2 == 1) counter++;
        }

        System.out.println(counter);

    }
}
