import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.next());
        long k=Long.parseLong(sc.next());
        HashMap<Integer, Integer> nums=new HashMap<Integer, Integer>();
        ArrayList<Integer> sorted=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            int a=Integer.parseInt(sc.next());
            nums.put(a, Integer.parseInt(sc.next()));
            sorted.add(a);
        }
        Collections.sort(sorted);
        long now=0;
        for(int a:sorted){
            if(now+nums.get(a)>=k){
                System.out.println(a);
                System.exit(0);
            }
            else{
                now+=nums.get(a);
            }
        }
    }
}