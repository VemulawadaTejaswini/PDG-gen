import java.util.*;

public class Main {
//    private static final int MOD = (int) 1e9+7;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Long> list = new ArrayList<>();
        for(int i = 0; i<n;++i){
            list.add(scanner.nextLong());
        }
        long res =0;
        while(list.size()>1){
            List<Long> temp = new ArrayList<>();
            int minIndex = 0;
            long minValue =Long.MAX_VALUE;
            for(int i = 0;i<list.size()-1;++i){
                if(list.get(i)+list.get(i+1)<minValue){
                    minIndex =i;
                    minValue =list.get(i)+list.get(i+1);
                }
            }
            res += minValue;
            for(int i = 0;i<list.size();++i){
                if(i==minIndex){
                    temp.add(minValue);
                    ++i;
                }else{
                    temp.add(list.get(i));
                }
            }
            list = temp;
        }
        System.out.println(res);
    }
}