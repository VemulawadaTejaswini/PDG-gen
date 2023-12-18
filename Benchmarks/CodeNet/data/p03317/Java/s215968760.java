import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        List<Integer>l=new ArrayList<>();
        for(int i=0;i<n+1;i++){
            l.add(s.nextInt());
        }
        System.out.print((n-1)/(k-1));
    }
}