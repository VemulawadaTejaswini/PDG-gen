import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> ns = new ArrayList<Integer>();

        IntStream.range(0,n).forEach(i -> {
            ns.add(sc.nextInt());
        });

        ns.sort(Comparator.reverseOrder());

        Map<Integer,Integer> map = new HashMap<>();

        ns.forEach(i->{
            if(map.containsKey(i)){
                Integer v = map.get(i);
                map.put(i,v+1);
            }else{
                map.put(i,1);
            }
        });

        HashSet<Integer> nsSet = new HashSet<>(ns);
        ArrayList<Integer> nsUniq = new ArrayList<>(nsSet);
        nsUniq.sort(Comparator.reverseOrder());

        List<Integer> resultList = new ArrayList<>();
        for (Integer i : nsUniq){
            if(resultList.size() >=2){
                break;
            }

            if ( 4 <= map.get(i) ) {
                resultList.add(i);
                resultList.add(i);
                break;
            }

            if ( 2 <= map.get(i) ) {
                resultList.add(i);
            }

        }

        if(resultList.size() < 2){
            System.out.println(0);
        } else {
            System.out.println(
                resultList.get(0) * resultList.get(1)
            );
        }






        /*
        Stream<Integer> stream = ns.stream();

        Object[] ary2 = stream.filter(i -> {
            if (map.get(i) >= 2) {
                return true;
            } else {
                return false;
            }
        }).toArray();*/

        /*
        for(Integer i : ns){
            if(count == 4){
                break;
            }
            if(count==0){
                Integer v = map.get(i);
                if (v >= 4) {
                    x = v;
                    y = v;
                    count = 4;
                } else if(v >=2 ) {
                    x = v;
                    count = 2;
                    continue;
                }
                continue;
            }

            if(count == 2){
                Integer v = map.get(i);
                if(v >= 2){
                    y = v;
                    count=4;
                }
            }
        }

        System.out.print(x * y);

*/
    }


}