import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<String> list = new ArrayList<>();
        for(int i = 0;i < n;i++){
            char[] ca = sc.next().toCharArray();
            Arrays.sort(ca);
            list.add(new String(ca));
        }

        long ans = 0;
        for(int i = 0;i < n;i++){
            for(int j = i+1;j < n;j++){
                if(list.get(i).equals(list.get(j))){
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}


