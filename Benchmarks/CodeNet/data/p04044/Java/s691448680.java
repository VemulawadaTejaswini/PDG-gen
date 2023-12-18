import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.nextLine();
        List<String> list = new ArrayList<String>();
        for(int i = 0;i<b;i++){
            list.add(sc.nextLine());
        }
        Collections.sort(list);
        list.forEach(System.out::print);
    }
}