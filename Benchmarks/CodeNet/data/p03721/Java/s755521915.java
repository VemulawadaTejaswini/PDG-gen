import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        //line捨て
        sc.nextLine();
        List<String> appendList = scanList(sc, n);
        System.out.println(execute(n,k,appendList));

    }

    public static int execute(int n, int k, List<String> appendList) {
        NumAppend numAppend = new NumAppend();
        for(String append : appendList){
            String[] nums = append.split(" ");
            numAppend.addNum(Integer.valueOf(nums[0]),Long.valueOf(nums[1]));
        }
        return numAppend.getNum(k);
    }

    public static List<String> scanList(Scanner sc,int num){
        List<String> scanList = new ArrayList<>();
        for(int i = 0; i < num ; i++){
            scanList.add(sc.nextLine());
        }
        return scanList;
    }

    private static class NumAppend {
        Map<Integer,Long> numMap;

        public NumAppend(){
            numMap = new TreeMap<>(Comparator.naturalOrder());
        }
        public void addNum(int num,Long times){
            if(numMap.containsKey(num)){
                times += numMap.get(num);
            }
            numMap.put(num,times);
        }

        public Integer getNum(int length){
            long nowLength = 0;
            Integer num = null;
            for(Map.Entry<Integer,Long> entry : numMap.entrySet()){
                num = entry.getKey();
                nowLength += entry.getValue();
                if(nowLength >= length){
                    break;
                }
            }
            return num;

        }
    }


}

