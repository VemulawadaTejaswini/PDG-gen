import java.util.*;

public class Main{

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        Integer n = Integer.parseInt(scan.next());
        ArrayList<Integer> array = new ArrayList<Integer>();

        for(int i=0;i<n;i++)   
            array.add(Integer.parseInt(scan.next()));

        for(int i=0;i<n;i++){
            int t = array.remove(i);
            System.out.println(Collections.max(array));
            array.add(i,t);
        }

    }
}