import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int count = 1;
        int dubMinus = 0;
        int ascMinus = 0;
        int listIndex = 0;
        int prev = sc.nextInt();
        TreeSet<Integer> numSet = new TreeSet<>();
        List<Integer> list = new ArrayList<>();
        numSet.add(prev);
        list.add(prev);
        for(int i = 1; i < N; i++){
            boolean ascFlg = false;
            boolean dubFlg = false;
            int P = sc.nextInt();
            if(prev < P){
                count++;
            }else{
                count = 1;
            }
            if(count == K){
                ascFlg = true;
                ascMinus++;
                count--;
            }
            // K個になるまでSetに溜め込む
            int max = numSet.last();
            numSet.add(P);
            list.add(P);
            if(numSet.size() == K + 1){
                int min = numSet.first();
                int newMax = numSet.last();
                numSet.remove(list.get(listIndex));
                listIndex++;
                int newMin = numSet.first();
                if(min != newMin && max != newMax){
                    dubFlg = true;
                }
            }
            if(!ascFlg && dubFlg){
                dubMinus++;
            }
            prev = P;
        }
        ascMinus = ascMinus > 0 ? ascMinus - 1 : 0;
        System.out.println(N - K + 1 - ascMinus - dubMinus <= 0 ? 1 : N - K + 1 - ascMinus - dubMinus);
    }
}
