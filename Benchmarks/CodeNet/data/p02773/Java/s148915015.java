import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String,Integer> hash = new HashMap<>();
        int n =sc.nextInt();
        for (int i=0;i<n;i++){
            String s = sc.next();
            if (hash.containsKey(s)){
                hash.put(s,hash.get(s)+1);
            }else {
                hash.put(s,1);
            }
        }
        int max = Collections.max(hash.values());
        ArrayList<String> st  = new ArrayList<>();
        for (Map.Entry entry : hash.entrySet()){
            if ((int)entry.getValue()==max)st.add((String) entry.getKey());
        }
        Collections.sort(st);
        for (int i=0;i<st.size();i++)System.out.println(st.get(i));
    }
    static int factorial(int num){
        if (num==1||num==0)return 1;
        else return num*factorial(num-1);
    }
    static int arraySum(int[] array){
        int ans = 0;
        for (int value : array) ans += value;
        return ans;
    }
    static int combination(int a, int b){
        return factorial(a)/(factorial(b)*factorial(a-b));
    }
    static double log(double base,double antilogarithm){
        return Math.log(antilogarithm)/Math.log(base);
    }


}
