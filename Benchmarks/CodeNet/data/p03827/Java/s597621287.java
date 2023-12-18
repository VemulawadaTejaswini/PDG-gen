import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        char[] cs = s.toCharArray();
        List<Integer> iro = new ArrayList<>();
        int x = 0;
        iro.add(x);
        for(int i = 0; i < cs.length; i++){
            if(cs[i] == 'I'){
                int a = x + 1;
                x++;
                iro.add(a);
            }
            else if(cs[i] == 'D'){
                int a = x - 1;
                x--;
                iro.add(a);
            }
        }
        Collections.sort(iro, Collections.reverseOrder());
        System.out.println(iro.get(0));
    }
}
