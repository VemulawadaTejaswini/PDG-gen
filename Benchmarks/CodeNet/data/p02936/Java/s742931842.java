import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        List<Vertex> result = new ArrayList<>();
        Vertex root = new Vertex(0, new ArrayList<Vertex>());
        result.add(root);
        for(int i = 1; i < N; i++){
            result.add(new Vertex(i, new ArrayList<Vertex>()));
        }
        for(int i = 1; i < N; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            result.get(a - 1).v.add(result.get(b - 1));
        }
        for(int i = 0; i < Q; i++){
            int p = sc.nextInt();
            int x = sc.nextInt();
            result.get(p - 1).addCalcValue(x);
        }
        calc(0, result.get(0), result);
        for(int i = 0; i < result.size(); i++){
            System.out.print(result.get(i).value + " ");
        }
    }
    
    public static class Vertex{
        public List<Vertex> v;
        public int vNum = 0;
        public long value = 0;
        public long calcValue = 0;
        Vertex(int vNum, List<Vertex> v){
            this.v = v;
            this.vNum = vNum;
        }
        
        public void addValue(long value){
            this.value += value;
        }
        
        public void addCalcValue(long calcValue){
            this.calcValue += calcValue;
        }
    }
    
    public static void calc(long value, Vertex base, List<Vertex> resultMap){
        List<Vertex> vList = base.v;
        resultMap.get(base.vNum).value = value + base.calcValue;
        if(vList == null || vList.size() == 0){
            return;
        }else{
            for(int i = 0; i < vList.size(); i++){
                calc(value + base.calcValue, vList.get(i), resultMap);
            }
        }
    }
}
