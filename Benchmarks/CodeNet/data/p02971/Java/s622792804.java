import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n=Integer.parseInt(s.nextLine());
        List<Integer> is = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            is.add(Integer.parseInt(s.nextLine()));
        }
        int c=0;
        for(int i=0;i<is.size();i++){
            int max = 0;
            if(c==i){
                c++;
                continue;
            }
            int h = is.get(i);
            if(max < h){
                max = h;
            }
            System.out.println(max);
        }
    }
}