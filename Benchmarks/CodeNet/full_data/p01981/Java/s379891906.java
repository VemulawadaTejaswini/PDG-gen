import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Map<Integer,Ele> map=new HashMap<>();
        int count=0;
        while (true)
        {
            String g=sc.next();
            if (g.equals("#")){break;}
            int y=sc.nextInt();
            int m=sc.nextInt();
            int d=sc.nextInt();
            if (y>31)
            {
                g="?";
                y-=30;
            }else if (y==31 && m>=5)
            {
                g="?";
                y-=30;
            }
            Ele ele=new Ele(g,y,m,d);
            map.put(count,ele);
            ++count;
        }
        for (int i:map.keySet()) { map.get(i).printEle(); }
    }
}

class Ele
{
    String gengou;
    int year;
    int mon;
    int date;

    public Ele(String g,int y,int m,int d)
    {
        gengou=g;
        year=y;
        mon=m;
        date=d;
    }

    public void printEle() { System.out.println(gengou+" "+year+" "+mon+" "+date); }
}
