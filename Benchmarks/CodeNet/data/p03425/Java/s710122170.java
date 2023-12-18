import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        HashMap<Character, HashSet<String>> hashMap = new HashMap<>();



        char[] prefixs = new char[5];
        prefixs[0] = 'M';
        prefixs[1] = 'A';
        prefixs[2] = 'R';
        prefixs[3] = 'C';
        prefixs[4] = 'H';

        long ans = 0;
        for(int i=0; i<5; i++){
            hashMap.put(prefixs[i], new HashSet<>());
        }

        for(int i=0; i<N; i++){
            String S = scanner.next();

            char firstChar = S.charAt(0);

            if(hashMap.containsKey(firstChar)){
                hashMap.get(firstChar).add(S);
            }else{
                hashMap.put(firstChar, new HashSet<>());
                hashMap.get(firstChar).add(S);
            }
        }

        for(int i=0; i<3; i++){
            for(int j=i+1; j<4; j++){
                for(int k=j+1; k<5; k++){
                    ans += hashMap.get(prefixs[i]).size() * hashMap.get(prefixs[j]).size() * hashMap.get(prefixs[k]).size();
                }
            }
        }

        System.out.println(ans);
    }
}
