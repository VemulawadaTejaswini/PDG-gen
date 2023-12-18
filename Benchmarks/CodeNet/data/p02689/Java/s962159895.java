import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int k=scan.nextInt();
        int ans=n;
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i=0;i<n;i++){
            hm.put(i+1,scan.nextInt());
        }
        for(int i=0;i<k;i++){
            int A=scan.nextInt();
            int B=scan.nextInt();
            if(hm.get(A) < hm.get(B)    ){
                hs.add(A);
            }
            else if(hm.get(A) > hm.get(B)   ){
                hs.add(B);
            }
            else{
                hs.add(A);
                hs.add(B);
            }
        }
        System.out.println(n-hs.size());
        
    }
}
