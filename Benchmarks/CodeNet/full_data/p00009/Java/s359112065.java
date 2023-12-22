import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> ans = new ArrayList<>();
        int n = 0;
        while(sc.hasNext() && n++ < 30){
            ans.add("" + primeCount(sc.nextInt()));
        }
        for(int i = 0,size = ans.size();i < size;i++) System.out.println(ans.get(i));
    }
    static int primeCount(int num){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 2;i <= num;i++) list.add(i);
        for(int i = 0;i < list.size() && list.get(i) < Math.sqrt(num);i++){
            for(int j = i + 1;j < list.size();j++){
                if(list.get(j) % list.get(i) == 0) list.remove(j--);
            }
        }
        return list.size();
    }
}