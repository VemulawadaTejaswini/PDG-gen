import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();
        ArrayList<Integer> List= new ArrayList<>();
        for(int i=L;i<=R;i++) List.add(i%2019);
        Collections.sort(List);
        int opt = List.get(0)*List.get(1);
        System.out.println(opt);
    }
}
