import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String s = scanner.next();
        int q = scanner.nextInt();
        char[] chars = s.toCharArray();

        for( int i = 0 ; i < q ; i++){
            int type = scanner.nextInt();
            int q1 = scanner.nextInt();
            String q2 = scanner.next();

            if(type == 1){
                chars[q1 - 1] = q2.toCharArray()[0];

            }else if(type == 2){
                Set<Character> cs = new HashSet<>();
                int max = Integer.parseInt(q2);
                for(int j = q1 ; j <= max ; j++){
                    cs.add(chars[j - 1]);
                }
                System.out.println(cs.size());
            }
        }
        System.exit(0);
    }
}
