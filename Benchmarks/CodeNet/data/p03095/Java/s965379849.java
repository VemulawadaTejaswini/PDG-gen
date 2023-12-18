import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();

//        Set<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        sb.append(S.charAt(0));
//        set.add(S.charAt(0));
        int i = dft(S,1,sb);
//        set.remove(S.charAt(0));
        sb.delete(sb.length()-1,sb.length());

        i += dft(S,1,sb);

        System.out.println(i);
    }

    static int mod = (int) (Math.pow(10,9) + 7);
    static Map<String, Map<Integer,Integer>> dp = new HashMap<>();
    static int dft(String S, int idx , StringBuilder sb){

        if(dp.containsKey(sb.toString())){
            Map<Integer,Integer> m = dp.get(sb.toString());
            if(m.containsKey(idx)){
                return m.get(idx);
            }
        }


        if(idx== S.length() ){
            if(sb.length()>0) return 1;
            return 0;
        }
        char c = S.charAt(idx);

        int i =0;
        //use this char
//        if(set.contains(c)){
        if(sb.indexOf(c+"")>=0){
            i += 0 ;
        }else{
            //set.add(c);
            sb.append(c);
            i += dft(S,idx+1,sb);
//            set.remove(c);
            sb.delete(sb.length()-1,sb.length());
        }

        i+=dft(S,idx+1,sb);

        if(i > mod ){
            i=  i % mod;
        }

        Map<Integer,Integer> m;
        if(!dp.containsKey(sb.toString())){
             m = new HashMap<>();
        }else{
            m = dp.get(sb.toString());
        }
        m.put(idx,i);

        return i;
    }

}
