import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str = scanner.next();
        char[] cha = str.toCharArray();


        int min = 9999;
        Map<String, Long> hashMap = new HashMap<>();
        for (int i=0;i<n;i++){
            int instance = 0;
            for (int j=0;j<i;j++){
                if (cha[j]=='W')instance++;
            }
            for (int j=i+1;j<n;j++){
                if (cha[j]=='E')instance++;
            }
            min = Math.min(min,instance);
        }
        System.out.println(min);
    }
}
