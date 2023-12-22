import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        ArrayList<Integer> L = new ArrayList<>();
        for(int i=0;i<q;i++){
            int cmd = sc.nextInt();
            if(cmd==0)L.add(sc.nextInt());
            else if(cmd==1) System.out.println(L.get(sc.nextInt()));
            else L.remove(L.size()-1);
        }
    }
}
