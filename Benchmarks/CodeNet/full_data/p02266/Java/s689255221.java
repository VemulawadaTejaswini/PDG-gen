import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
 
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        ArrayDeque<Integer> left = new ArrayDeque<Integer>();
        ArrayDeque<Integer> areaLeft = new ArrayDeque<Integer>();
        ArrayDeque<Integer> area = new ArrayDeque<Integer>();
         
        for(int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if(c == '\\'){
                left.addFirst(i);
            }else if(c == '/'){
                if(!left.isEmpty()) {
                    int l = left.removeFirst();
                    areaLeft.addFirst(l);
                    area.addFirst(i-l);
                }
            }
        }
         
        int lastl = s.length();
        while(!areaLeft.isEmpty()){
            int l = areaLeft.removeFirst();
            if(l > lastl){
                area.addLast(area.removeFirst() + area.removeLast());
            }else{
                area.addLast(area.removeFirst());
                lastl = l;
            }
        }
         
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        for(Integer i : area){
            sum += i;
            sb.insert(0, " " + i);
        }
        sb.insert(0, area.size());
         
        System.out.println(sum);
        System.out.println(sb);
    }
     
}