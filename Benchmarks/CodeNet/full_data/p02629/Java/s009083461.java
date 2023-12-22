
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
 
public class Main {    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next());
        int count = 0;
        long cul = n - 1 ;
        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        map.put(4,"d");
        map.put(5,"e");
        map.put(6,"f");
        map.put(7,"g");
        map.put(8,"h");
        map.put(9,"i");
        map.put(10,"j");
        map.put(11,"k");
        map.put(12,"l");
        map.put(13,"m");
        map.put(14,"n");
        map.put(15,"o");
        map.put(16,"p");
        map.put(17,"q");
        map.put(18,"r");
        map.put(19,"s");
        map.put(20,"t");
        map.put(21,"u");
        map.put(22,"v");
        map.put(23,"w");
        map.put(24,"x");
        map.put(25,"y");
        map.put(26,"z");
        while(true){
            cul = cul / 26;
            if(cul!=0){
                count++;
            }else{
                break;
            }
        }
//        System.out.println(count);
        StringBuffer sb = new StringBuffer();
        for(int i=count;i>=0;i--){
            long dev = 1;
            for(int j=1;j<=i;j++){
                dev = dev * 26;
            }
            if(i!=0){
                long ans = n/dev;
                    String anss = map.get((int)ans);
                    sb.append(anss);
                n = n % dev; 
            }else{
                String anss = map.get((int)n);
                sb.append(anss);
//                System.out.println((int)n);
            }            
        }
        System.out.println(sb.toString());
    }
}