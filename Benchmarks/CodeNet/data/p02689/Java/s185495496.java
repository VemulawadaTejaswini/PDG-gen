import java.util.*;
import java.math.*;
     
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){

            long n = Long.parseLong(sc.next());
            long m = Long.parseLong(sc.next());

            ArrayList<Long> height = new ArrayList<>();
            ArrayList<Integer> bad = new ArrayList<>();

            height.add((long)0);

            for(int i = 0; i < n; i++){
                height.add(Long.parseLong(sc.next()));
            }

            for(int i = 0; i < m; i++){
                int a = Integer.parseInt(sc.next());
                int b = Integer.parseInt(sc.next());

                if(height.get(a) > height.get(b)) bad.add(b);
                else if(height.get(a) == height.get(b)){
                    bad.add(a);
                    bad.add(b);
                }else bad.add(a);
            }

            ArrayList<Integer> ans = new ArrayList<>(new HashSet<>(bad));

            System.out.println(n - (long)ans.size());

        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}