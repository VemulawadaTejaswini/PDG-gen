import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by ??\??? on 2016/12/6.
 */
public class Main {
    static int si(String s){
        return Integer.parseInt(s);
    }
    static int run(String[] args){
        Scanner scan = new Scanner(System.in);
        int T = si(scan.nextLine());

        List<Integer> l = new ArrayList<>();
        for(int i=0;i<T;i++){
            String[] lines = scan.nextLine().split(" ");
            if(lines[0].equals("deleteFirst")){
                l.remove(0);
                continue;
            }
            if(lines[0].equals("deleteLast")){
                l.remove(l.size()-1);
                continue;
            }
            int v = Integer.parseInt(lines[1]);
            if(lines[0].equals("insert")){
                l.add(0,v);
            }
            if(lines[0].equals("delete")){
                if(l.contains(v))
                    l.remove(l.indexOf(v));
            }
        }
        for(int i = 0;i < l.size();i++){
            if(i==0)
                System.out.print(l.get(i));
            else
                System.out.print(" "+l.get(i));
        }
        System.out.println();
        return 1;
    }
    public static void main(String[] args){
        run(args);
    }
}