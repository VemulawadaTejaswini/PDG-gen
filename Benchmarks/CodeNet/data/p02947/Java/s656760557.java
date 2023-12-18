import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner s  = new Scanner(System.in);
        int n, i, x, count;
        String str="";
        char arr[];
        n = s.nextInt();
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        for(i=0; i<n; i++){
            str = s.next();
            arr = str.toCharArray();
            Arrays.sort(arr);
            str  = new String(arr);
            if(hm.containsKey(str))
                hm.put(str, hm.get(str)+1);
            else
                hm.put(str, 1);
        }
        
        count = 0;
        Iterator itr = hm.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry me = (Map.Entry)itr.next();
            x = (int)me.getValue();
            count += (x*(x-1))/2;
        }
      System.out.println("" + count);
    }
}