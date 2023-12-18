import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

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
                //WA
                if(!m_AC.containsKey(p_num)){
                    if(m_AC.containsKey(p_num)){
                        m_WA.put(p_num, m_WA.get(p_num)+1);
                    }else{
                        m_WA.put(p_num, 1);
                    }
                }
            }
        }
        long ac_total = 0;
        long wa_total = 0;
        for(int i = 0; i < 100001 ; i++){
            if(m_AC.containsKey(i)){
                ac_total += 1;
                if(m_WA.containsKey(i)){
                    wa_total += m_WA.get(i);
                }
            }
        }
        System.out.println(ac_total + " " + wa_total);
    }
}