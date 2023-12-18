import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static long my_pow(long a, long b){
        long answer = 1;
        for(long i = 0;i < b;i++){
            answer *= a;
        }
        return answer;
    }
    public static void main(String[] args){
        HashMap<Long,ArrayList<Long>> remainder_mapping = new HashMap<>();
        for(long i = 0;i < 2019;i++){
            remainder_mapping.put(i, new ArrayList<>());
        }
        Scanner sc = new Scanner(System.in);
        long target = Long.parseLong(sc.next());
        for(long i = 1;i < String.valueOf(target).length()+1; i++){
            remainder_mapping.get((target%my_pow(10,i))%2019).add(target%my_pow(10,i));
        }
        long answer = 0;
        for(long i = 0;i < 2019;i++){
            long candidates = remainder_mapping.get(i).size();
            if(candidates !=0){
                answer += ((candidates-1)*(candidates))/2;
                if(i == 0){
                    answer += candidates;
                }
            }
        }
        System.out.println(answer);
    }
}