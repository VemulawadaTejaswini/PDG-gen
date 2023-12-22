import java.util.*;

public class Main {

    public static void main(String[] args)
    {
        Map<List<Integer>,Integer> dataBase = new HashMap<>();
        List<Integer> first = new ArrayList<>();
        Integer[] firstData = {0,1,2,3,4,5,6,7,0};
        first.addAll(Arrays.asList(firstData));
        dataBase.put(first,0);
        Queue<List<Integer>> q = new LinkedList<>();
        q.add(first);
        while(!q.isEmpty())
        {
            List<Integer> tmp = q.remove();
            List<List<Integer>> next = getNext(tmp);
            for(List<Integer> item : next)
            {
                if(!dataBase.containsKey(item))
                {
                    dataBase.put(item,dataBase.get(tmp)+1);
                    q.add(item);
                }
            }
        }

        Scanner sc = new Scanner(System.in);
        while(sc.hasNext())
        {
            List<Integer> input = new ArrayList();
            int indexofzero = 0;
            for(int i=0;i<8;i++)
            {
                input.add(sc.nextInt());
                if(input.get(i)==0)indexofzero = i;
            }
            input.add(indexofzero);
            System.out.println(dataBase.get(input));
        }
    }

    static List<List<Integer>> getNext( List<Integer> prev)
    {
        List<List<Integer>> ret = new ArrayList<>();
        int point = prev.get(8);
        if(point%4!=0)
        {
            List<Integer> cur  =new ArrayList<>();
            cur.addAll(prev);
            int p = cur.get(point);
            cur.set(point,cur.get(point-1));
            cur.set(point-1,p);
            cur.set(8,point-1);
            ret.add(cur);
        }
        if(point%4!=3)
        {
            List<Integer> cur  =new ArrayList<>();
            cur.addAll(prev);
            int p = cur.get(point);
            cur.set(point,cur.get(point+1));
            cur.set(point+1,p);
            cur.set(8,point+1);
            ret.add(cur);
        }

        if(point>3)
        {
            List<Integer> cur  =new ArrayList<>();
            cur.addAll(prev);
            int p = cur.get(point);
            cur.set(point,cur.get(point-4));
            cur.set(point-4,p);
            cur.set(8,point-4);
            ret.add(cur);
        }
        else
        {
            List<Integer> cur  =new ArrayList<>();
            cur.addAll(prev);
            int p = cur.get(point);
            cur.set(point,cur.get(point+4));
            cur.set(point+4,p);
            cur.set(8,point+4);
            ret.add(cur);
        }
        return ret;
    }


}