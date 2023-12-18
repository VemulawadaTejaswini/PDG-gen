import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n=Integer.parseInt(s.nextLine());
        List<Integer> is = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            is.add(Integer.parseInt(s.nextLine()));
        }
        for(int i=0;i<is.size();i++){
            List<Integer> copy = new ArrayList<Integer>(is);
            copy.remove(i);
            System.out.println(Collections.max(copy));
        }
    }
}