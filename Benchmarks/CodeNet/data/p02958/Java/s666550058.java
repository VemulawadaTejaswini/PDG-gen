import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int in = Integer.parseInt(s.nextLine());
        String[] in2  = s.nextLine().split(" ");
        List<Integer> l = new ArrayList<Integer>();
        for(int i = 0;i<in;i++){
            l.add(Integer.parseInt(in2[i]));
        }
        List<Integer> sorted = new ArrayList<Integer>(l);
        Collections.sort(sorted);
        int count = 0;
        for(int i = 0;i<l.size();i++){
            int prev = l.get(i);
            int curr = sorted.get(i);
            if(prev != curr){
                count++;
            }
        }
        System.out.println(count == 0 || count == 2 ? "YES" : "NO");
    }
}