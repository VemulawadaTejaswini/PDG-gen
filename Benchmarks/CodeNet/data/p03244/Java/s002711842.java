import java.util.*;

public class Main {

    public static void main(String[] args) {

        // read n
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // read v_i
        List<Integer> odd_list = new LinkedList<Integer>();
        List<Integer> evn_list = new LinkedList<Integer>();
        for (int i = 0; i < n; i+=2) {
            odd_list.add(sc.nextInt());
            evn_list.add(sc.nextInt());
        }

        // count
        ValueCount mfvOdd = mostFrequentValue(odd_list);
        ValueCount mfvEvn = mostFrequentValue(evn_list);

        int result;
        if (mfvOdd.value() == mfvEvn.value()
            && mfvEvn.alone() && mfvOdd.alone()){

            ValueCount mfvOdd2 = mostFrequentValue(removeByCount(mfvOdd.value(), odd_list));
            ValueCount mfvEvn2 = mostFrequentValue(removeByCount(mfvEvn.value(), evn_list));

            int res1 = n - ((int) mfvOdd2.count()) - ((int) mfvEvn.count());
            int res2 = n - ((int) mfvOdd.count()) - ((int) mfvEvn2.count());

            result = Math.min (res1, res2);
        } else {
            result = n - ((int) mfvOdd.count()) - ((int) mfvEvn.count()); 
        }

        System.out.print(result + "\n");
    }

    private static ValueCount mostFrequentValue(List<Integer> list){
        // build map
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (Integer i : list) {
            int oldCount = map.containsKey(i) ? map.get(i) : 0;
            map.put(i, oldCount+1);
        }

        Iterator<Map.Entry<Integer,Integer>> iter = map.entrySet().iterator();
        ValueCount localMax = new ValueCount(0,0,true);
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            Integer currentValue = (Integer) entry.getValue();
            if        (currentValue > localMax.count()){
                localMax = new ValueCount((Integer) entry.getKey(), currentValue, true);
            } else if (currentValue == localMax.count()){
                localMax.notAlone();
            }
        }

        return localMax;
    }

    private static LinkedList<Integer> removeByCount(Integer i, List<Integer> list){
        LinkedList<Integer> result = new LinkedList<Integer>();
        ListIterator<Integer> iter = list.listIterator(0);
        while(iter.hasNext()){
            Integer next = iter.next();
            if(next != i){
                result.add(next);
            }
        }
        return result;
    }

}


class ValueCount{

    private Integer value;
    private Integer count = 0;
    private boolean alone;

    ValueCount(Integer v, Integer c, boolean b){
        value = v;
        count = c;
        alone  = b;
    }

    // getter
    public Integer count(){ return count; }
    public Integer value(){ return value; }
    public boolean alone(){ return alone; }

    public void notAlone(){
        alone = false;
    }

}
