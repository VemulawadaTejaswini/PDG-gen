import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        boolean zero = true;

        for(int i=0; i<N; i++){
            int tmp = scanner.nextInt();

            if(tmp != 0){
                zero = false;
            }

            if(hashMap.containsKey(tmp)){
                int tmpVal = hashMap.get(tmp);
                tmpVal++;
                hashMap.put(tmp, tmpVal);
            }else{
                hashMap.put(tmp, 1);
            }
        }

        if(hashMap.size() == 2){
            int[] keys =  hashMap.keySet().stream().mapToInt(Integer::intValue).toArray();
            if(hashMap.get(keys[0])*2 == hashMap.get(keys[1]) || hashMap.get(keys[0]) == hashMap.get(keys[1]) * 2){
                System.out.println("Yes");
                return;
            }else{
                System.out.println("No");
                return;
            }
        }
        
        if(N%3 != 0 && !zero){
            System.out.println("No");
            return;
        }
        
        if(hashMap.size() != 3){
            System.out.println("No");
            return;
        }else{
            int[] keys =  hashMap.keySet().stream().mapToInt(Integer::intValue).toArray();
            int tmp = keys[0]^keys[1]^keys[2];
            if(tmp != 0){
                System.out.println("No");
                return;
            }
            if(hashMap.get(keys[0]) == hashMap.get(keys[1]) && hashMap.get(keys[1]) == hashMap.get(keys[2])){
                System.out.println("Yes");
                return;
            }else{
                System.out.println("No");
                return;
            }
        }
    }
}
