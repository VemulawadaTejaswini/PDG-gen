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
                if(!m_AC.containsKey(p_num)){
                    if(m_AC.containsKey(p_num)){
                        m_WA.put(p_num, m_WA.get(p_num)+1);
                    }else{
                        m_WA.put(p_num, 1);
                    }
                }    
            }
        }
        int ac_total = 0;
        for(Entry<Integer,Integer> ac_entry: m_AC.entrySet()){
            ac_total += ac_entry.getValue();
        }
        int wa_total = 0;
        for(Entry<Integer,Integer> wa_entry: m_WA.entrySet()){
            wa_total += wa_entry.getValue();
        }
        System.out.println(ac_total + " " + wa_total);
    }
}