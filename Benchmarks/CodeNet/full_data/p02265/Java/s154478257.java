import java.io.*;
import java.util.*;



public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;

        str = br.readLine();
        int num = Integer.parseInt(str);
        
        Deque<Myo> d = new ArrayDeque<Myo>();
        for(int i = 0;i<num;i++){
            str = br.readLine();
            String[] strs = str.split("\\s");
            d.offerLast(new Myo(strs[0],Integer.parseInt(strs[1])));
        }
        
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int count = 0;
        while(!d.isEmpty()){
            Myo t = d.pollFirst();
            if(t.order.equals("insert")){
               count++;
               if(count == 1){
                   ans.add(t.n);
               }else{
                   int[] temps = new int[count];
                   for(int i =0;i<=ans.size();i++){
                       if(i==0){
                           temps[i] = t.n;
                       }else{
                           temps[i] = ans.get(i-1);
                       }
                   }
                   ans.clear();
                   for(int i= 0;i<temps.length;i++){
                       ans.add(temps[i]);
                   }
               }
            }
            if(t.order.equals("delete")){
                count--;
                for(int i=0;i<ans.size();i++){
                    if(t.n == ans.get(i)){
                        ans.remove(i);
                    }
                }
            }
            if(t.order.equals("deleteFirst")){
                count--;
                ans.remove(0);
            }
            if(t.order.equals("deleteLast")){
                count--;
                ans.remove(ans.size()-1);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<ans.size();i++){
            sb.append(String.valueOf(ans.get(i)));
            if(i == ans.size()-1){
                break;
            }
            sb.append(" ");
        }

        System.out.println(sb.toString());
        br.close();
    }

}
class Myo{
    String order;
    int n;
    Myo(String order,int n){
        this.order = order;
        this.n = n;
    }
    Myo(){
        this("",0);
    }
}
