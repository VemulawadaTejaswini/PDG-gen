import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<n;i++){
            l.add(s.nextInt());
        }
        Collections.sort(l);
        l.set(n-1,(l.get(n-1)/2));
        int ans=0;
        for(int i=0;i<n;i++){
            ans+=l.get(i);
        }
        System.out.print(ans);
    }
}
