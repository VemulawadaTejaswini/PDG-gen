import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.ArrayDeque;


public class Main {
    public static void main(String[] args) throws Exception {
        
        Deque<Integer> list = new ArrayDeque<Integer>();
        String line;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        while((line = br.readLine()) != null){
            String[] order = line.split(" ");
            char c = line.charAt(0);
            if(c == 'i')
                list.addFirst(Integer.valueOf(line.substring(7)));
            if(c == 'd'){
                int len = line.length();
                if(len == 11)
                    list.removeFirst();
                else if(len == 10)
                    list.removeLast();
                else
                    list.remove(Integer.valueOf(line.substring(7)));
            }
        }

        Integer m;
        if((m = list.pollLast()) != null){
            for(int n : list)
                System.out.printf("%d ", n);
            System.out.println(m);
        }
    }
}
