import java.security.cert.CollectionCertStoreParameters;
import  java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Map<String, Integer> map = new TreeMap<>();
        for (int i = 0; i < N; i++){
            map.merge(sc.next(),1, Integer::sum);
        }
        int maxValueInMap = (Collections.max(map.values()));
        for (Map.Entry<String, Integer> entry : map.entrySet()){
            if (entry.getValue() == maxValueInMap){
                System.out.println(entry.getKey());
            }
        }
    }
}
