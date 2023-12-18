import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<String> S = new ArrayList();
        List<Integer> P = new ArrayList();
        Map<String,Integer> namePointIndex = new HashMap();
        for(int i=0; i<N; i++){
            String name = scanner.next();
            Integer point = scanner.nextInt();
            S.add(name);
            P.add(point);
            namePointIndex.put(name + String.valueOf(point), i+1);
        }
        Set<String> nameset = new HashSet(S);
        S = new ArrayList(nameset);
        Collections.sort(S);
        Collections.sort(P,Comparator.reverseOrder());

        for(String name:S){
            for(int point:P){
                String key = name + String.valueOf(point);
                if(namePointIndex.containsKey(key)){
                    System.out.println(namePointIndex.get(key));
                }
            }
        }
    }

}