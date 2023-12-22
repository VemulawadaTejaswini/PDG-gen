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
        List<String> l = new LinkedList<>();
        for(int i=0;i<T;i++){
            String[] lines = scan.nextLine().split(" ");
            if(lines[0].equals("insert")){
                l.add(0,lines[1]);
            }
            if(lines[0].equals("delete")){
                l.remove(l.indexOf(lines[1]));
            }
            if(lines[0].equals("deleteFirst")){
                l.remove(0);
            }
            if(lines[0].equals("deleteLase")){
                l.remove(l.size()-1);
            }
        }
        for (String s: l) {
            System.out.print(l.indexOf(s)==0 ? s : " "+s);
        }
        System.out.println();
        return 1;
    }
    public static void main(String[] args){
        run(args);
    }
}