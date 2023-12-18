import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long count = 0;
        HashMap<String, Integer> hash = new HashMap<>();

        for(int i = 0; i < n; i++){
            char[] charArray = sc.next().toCharArray();
            Arrays.sort(charArray);
            String str = String.valueOf(charArray);
            if(hash.containsKey(str)){
                hash.put(str, hash.get(str) + 1);
                count += hash.get(str);
            } else {
                hash.put(str, 0);
            }
        }

        System.out.println(count);
    }
}