import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int cnt = 0;
        int kind = 0;
        int max = 0;

        for(int i = 0;i < n;i++){
            String s1 = s.substring(0,i+1);
            String s2 = s.substring(i+1, n);
            kind = 0;
            for(char j = 'a';j <= 'z';j++){
                String k = String.valueOf(j);
                if(s1.contains(k) && s2.contains(k))
                kind++;
            }
            max = Math.max(kind,max);
        }

        System.out.println(max);
    }
}