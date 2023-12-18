import java.util.*;

public class Main {
    public static void main(String[] args) {
        Long n,count = (long)0;
        List<String> s = new ArrayList<String>();
        List<String> s1 = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        n = sc.nextLong();
        for(int i = 0; i < n; i++){
            s.add(sc.next());
            for(int j = 1; j < s.size(); j++){
                if(s.get(i).equals(s.get(j))){
                    if(s1.size() == 0){
                        count++;
                        s1.add(s.get(i));
                    }
                }
            }
        }
        for(int i = 1; i < s1.size(); i++){
            if(s1.get(i-1).equals(s1.get(i))){
                count --;
            }
        }
        System.out.println(count);
    }
}