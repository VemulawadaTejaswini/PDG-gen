import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        
        ArrayList<Integer> si = new ArrayList<Integer>();
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == 'B') si.add(0);
            else si.add(1);
        }
        
        int index = 0;
        int count = 0;
        while(index < n - 1){
            if(si.get(index) == 0 && si.get(index + 1) == 1){
                si.set(index, 1);
                si.set(index + 1, 0);
                count++;
                index = Math.max(0, index - 1);
            }else{
                index++;
            }
        }
        System.out.println(count);
    }
}