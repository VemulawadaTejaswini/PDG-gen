import java.util.*;

public class Main {
    public static boolean debug = true;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        TreeMap<Integer, List<Integer>> map = new TreeMap<>(new Comparator<Integer>() {
            public int compare(Integer m, Integer n){
                return ((Integer)m).compareTo(n) * -1;
            }
        });

        for(int i=0; i<n; i++){
            int d = sc.nextInt();
            int money = sc.nextInt();

            List<Integer> temp = null;
            if(map.containsKey(money)){
                temp = map.get(money);
            }else{
                temp = new ArrayList<>();
            }
            temp.add(d);
            map.put(money,temp);
        }

        //debug(map);

        int sum = 0;
        for(int i=0;i<m;i++){
            for(int money :map.keySet()){
                List<Integer> list = map.get(money);
                Collections.sort(list, Comparator.reverseOrder());
                boolean hit = false;
                List<Integer> delList = new ArrayList<>();
                for(int j=0;j<list.size();j++){
                    int day = list.get(j);
                    delList.add(j);
                    if(day<=m-i){
                        //System.out.println(i + "日目 " + money + "円の仕事 " + day + "必要 残り日数" + (m-i));
                        sum += money;
                        hit = true;
                        break;
                    }
                }
                for(int del:delList){
                    list.remove(del);
                }
                map.put(money,list);
                if(hit){
                    break;
                }




            }

        }

        System.out.println(sum);



    }

    public static void debug(TreeMap<Integer, List<Integer>> map){
        for(int key: map.keySet()){
            List<Integer> list = map.get(key);
            StringBuilder builder = new StringBuilder();
            for(int i:list){
                builder.append(i + ",");
            }
            System.out.println(key + "["+builder.toString()+  "]");
        }


    }
}