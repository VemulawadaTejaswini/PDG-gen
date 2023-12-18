import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());
        Map<Integer,Integer> m_AC = new HashMap<>();
        Map<Integer,Integer> m_WA = new HashMap<>();
        for(int i = 0; i < M ; i++){
            int p_num = Integer.parseInt(sc.next());
            String status = sc.next();
            if(status.equals("AC")){
                m_AC.put(p_num, 1);
            }else{
                if(!m_AC.containsKey(p_num)){
                    if(m_WA.containsKey(p_num)){
                        m_WA.put(p_num, m_WA.get(p_num) + 1);
                    }else{
                        m_WA.put(p_num, 1);
                    }
                }
            }
        }
        long ac = 0;
        for(int k :m_AC.keySet()){
            ac += 1;
        }
        long wa = 0;
        for(int k :m_WA.keySet()){
            wa += m_WA.get(k);
        }
        System.out.println(ac + " " + wa);
    }
}