import java.util.*;

public class Main {
    public static void main(String[] args) {
        Long n,count = (long)0;
        String s1;
        List<String> s = new ArrayList<String>();    
        Scanner sc = new Scanner(System.in);
        n = sc.nextLong();
        for(int i = 0; i < n; i++){
            s1 = sc.next();
            if(i == 0){
                s.add(s1);
                count++;
            }else if(s.contains(s1)){
                s.add(s1);
            }else{
                count++;
            }
        }
        System.out.println(count);
    }
}