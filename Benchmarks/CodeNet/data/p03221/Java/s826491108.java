import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();

        List<REL> rel = new LinkedList<>();
        for(int i = 0; i < M; i++){
            int P = sc.nextInt();
            int Y = sc.nextInt();
            rel.add( new REL(P, Y, i) );
        }
        
        Comparator<REL> comparator = new Comparator<>(){
            @Override
            public int compare(REL o1, REL o2){
                if( o1.P > o2.P ) return 1;
                if( o1.P < o2.P ) return -1;
                if( o1.Y > o2.Y ) return 1;
                if( o1.Y < o2.Y ) return -1;
                return 0;
            }
        };
        Collections.sort(rel, comparator);
        
        Map<Integer,String> map = new TreeMap<>();
        
        int orderY = Integer.MAX_VALUE;
        int beforeP = Integer.MAX_VALUE;
        for(REL x : rel){
            if( x.P != beforeP ){
                beforeP = x.P;
                orderY = 1;
            } else {
                orderY++;
            }
            
            String ID = String.format("%06d", x.P) + String.format("%06d", orderY);
            map.put(x.order, ID);
        }
        
        StringBuilder sb = new StringBuilder();
        for( int i : map.keySet() ){
            sb.append( map.get(i) ).append("\r\n");
        }

        System.out.println(sb.toString());
    }
    
    static class REL{
        int order;
        int P;
        int Y;
        public REL(int P, int Y, int order){
            this.order = order;
            this.P = P;
            this.Y = Y;
        }
        
        public String toString(){
            return P + " " + Y;
        }
    }
}
