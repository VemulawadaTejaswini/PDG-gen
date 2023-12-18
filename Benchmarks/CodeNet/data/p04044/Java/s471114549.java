import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String c = sc.nextLine();
        Set<String> set = new TreeSet<String>();
        for(int i = 0;i<b;i++){
            set.add(sc.nextLine());
        }
        for (Iterator<String> i = set.iterator(); i.hasNext();) {
            System.out.print(i.next());
        }
    }
}