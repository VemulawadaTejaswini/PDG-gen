import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class list_sample{
    
    public static void main(String[] args){

        ArrayList<Integer> l = new ArrayList<Integer>();
        ArrayList<Integer> tmp;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(n-- > 0) l.add(sc.nextInt());

        for(int i = 0; i < l.size(); i++){
            tmp = new ArrayList<Integer>(l);
            tmp.remove(i);

            tmp.sort(((a, b) -> a - b));

            System.out.println(tmp.get(tmp.size()/2));
        }
    }

}