import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main
{
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) throws Exception
    {
        String[] strs = s.nextLine().split("[ ,\\.]");
        LinkedHashSet<String> set = new LinkedHashSet<String>();
        for(String str : strs)
        {
            int len = str.length();
            if(3<=len && len<=6) set.add(str);
        }
        System.out.println(join(set)+" ");

    }
    static String join(Iterable<?> v)
    {
        Iterator<?> itr = v.iterator();
        if(!itr.hasNext()) return "";
        StringBuilder sb = new StringBuilder();
        while(true)
        {
            sb.append(itr.next());
            if(!itr.hasNext()) return sb.toString();
            sb.append(' ');
        }
    }
}