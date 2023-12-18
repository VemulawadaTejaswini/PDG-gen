import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int e = Math.abs(a-b);

        if(e < c){
            c = e;
        }
        Set<Integer> set = new TreeSet<>();

        for(int i = 0;i<c;i++){
            set.add(a++);
        }
        for(int i = 0;i<c;i++){
            set.add(b--);
        }
        for(Integer d:set){
            System.out.println(d);
        }
    }
}