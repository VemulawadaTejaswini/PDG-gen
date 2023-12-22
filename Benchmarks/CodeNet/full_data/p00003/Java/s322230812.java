import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> edges = new ArrayList<Integer>();
        for(int i = 0; i < n; i++){
            edges.add(sc.nextInt());
            edges.add(sc.nextInt()); 
            edges.add(sc.nextInt()); 
            Collections.sort(edges);
            int ans = (edges.get(0) * edges.get(0)) +(edges.get(1) * edges.get(1)) - (edges.get(2) * edges.get(2));
            if(ans == 0){
            System.out.println("Yes");   
            }else{
                System.out.println("No"); 
            }
        }
    }
}