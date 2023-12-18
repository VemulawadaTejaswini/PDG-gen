import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author must
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic hereｓs
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        int K = sc.nextInt();
        
        HashMap<String, Integer> hm = new HashMap<>();
        
        int slen = s.length();
        int subMax = slen;
        if(subMax>K){
            subMax = K;
        }
        
        for(int m=1;m<=subMax;m++){
            for(int i=0;i<slen;i++){
                if(i+m<=slen){
                    String tmp = s.substring(i, i+m);
                    String blankCheck = tmp.replaceAll(" ", "");
                    if(blankCheck.length()==0){
                        continue;
                    }
                    if (hm.containsKey(tmp)==false){
                        hm.put(tmp, 1);
                    }
                }
            }
        }
        
        Object[] mapKey = hm.keySet().toArray();
        Arrays.sort(mapKey);
        
        String ss = String.valueOf(mapKey[K-1]);
        
        System.out.println(ss);
    }
    
}
