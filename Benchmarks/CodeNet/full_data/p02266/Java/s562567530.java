import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.IntStream.Builder;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Stack<Integer> s1 = new Stack<Integer>();
        Stack<Puddle> s2 = new Stack<Puddle>();
        int i = 0;
        IntStream.Builder all_sum = IntStream.builder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c;
        while((c = br.read()) != -1){
            if(c == '\\') s1.push(i);
            else if(c == '/' && !s1.isEmpty()){
                int j = s1.pop();
                all_sum.add(i - j);
                IntStream.Builder areas = IntStream.builder();
                while(!s2.isEmpty() && s2.peek().pos() > j)
                    areas.add(s2.pop().area());
                s2.push(new Puddle(j, areas.build().sum() + i - j));
            }
            ++i;
        }
        System.out.println(all_sum.build().sum());
        
        StringBuilder sb = new StringBuilder();
        sb.append(s2.size());
        for(Puddle p : new ArrayList<Puddle>(s2))
            sb.append(" ").append(p.area());
        
        System.out.println(sb);
    }
}

class Puddle{
    private int _pos;
    public int pos(){ return _pos; };
    private int _area;
    public int area(){ return _area; };
    
    public Puddle(int _pos, int _area){
        this._pos  = _pos;
        this._area = _area;
    }

}
