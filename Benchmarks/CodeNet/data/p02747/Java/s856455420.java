import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    static Scanner sc  = new Scanner(System.in);

    public static void main(String[] args) {
        String s = sc.next();
        ArrayList<Integer> hi = matchStringByIndexOf(s, "hi");
        ArrayList<Integer> hii = matchStringByIndexOf(s, "hii");
        if(!hi.isEmpty() && !hii.contains(hi)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    static private ArrayList<Integer> matchStringByIndexOf( String parent,String child )
    {
        ArrayList<Integer> res = null;
        int index = 0;
        while( ( index = parent.indexOf(child, index) ) != -1 )
        {
            res.add(index);
            index = index+child.length();
        }
        return res;
    }
}
