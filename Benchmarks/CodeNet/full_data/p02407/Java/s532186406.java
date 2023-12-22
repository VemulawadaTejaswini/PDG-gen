import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        for(int i = 0;i < n;++i) list.add(sc.nextInt());
        list.sort((o1,o2)->o2-o1);
        StringBuilder sb = new StringBuilder().append(list.get(0));
        for(int i = 1,l = list.size();i < l;++i) sb.append(' ').append(list.get(i));
        System.out.println(sb);
    }

}