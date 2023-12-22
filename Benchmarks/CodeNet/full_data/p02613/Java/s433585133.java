import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = Integer.parseInt(s.nextLine());
        String[] Sz = new String[N];
        for (int i = 0; i < N; i++){
            Sz[i] = s.nextLine();
        }
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        for (int i = 0; i < N; i++){
            if (!map.keySet().contains(Sz[i])){
                map.put(Sz[i],1);
            } else {
                map.put(Sz[i],map.get(Sz[i]) + 1);
            }
        }
        if (map.get("AC") == null){
            System.out.println("AC x 0");
        } else {
            System.out.println("AC x "+map.get("AC"));
        }
        if (map.get("WA") == null){
            System.out.println("WA x 0");
        } else {
            System.out.println("WA x "+map.get("WA"));
        }
        if (map.get("TLE") == null){
            System.out.println("TLE x 0");
        } else {
            System.out.println("TLE x "+map.get("TLE"));
        }
        if (map.get("RE") == null){
            System.out.println("RE x 0");
        } else {
            System.out.println("RE x "+map.get("RE"));
        }
        
    }
}