import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        HashSet<String> hs = new HashSet<String>();
        for(int i=0;i<a;i++){
            hs.add(scan.next());
        }
        System.out.println(hs.size());
    }
}
