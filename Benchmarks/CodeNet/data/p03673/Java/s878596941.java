import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList <Integer> a = new ArrayList<>();
        ArrayList <Integer> b = new ArrayList<>();
        for(int i=0; i<n; i++){
            a.add(sc.nextInt());
        }
        
        for(int i=0; i<n; i++){
            b.add(a.get(i));
            Collections.reverse(b);
        }
        
        for(int i=0; i<n; i++){
            System.out.print(b.get(i)+" ");
        }
    }
}
