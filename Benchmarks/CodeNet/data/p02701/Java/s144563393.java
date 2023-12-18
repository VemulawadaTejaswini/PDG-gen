import java.util.*;

public class Main {
    public static void main(String[] args) {
        Long n,count = (long)0;
        List<String> s = new ArrayList<String>();
        List<Integer> s1 = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        n = sc.nextLong();
        for(int i = 0; i < n; i++){
            s.add(sc.next());
            s1.add(0);
           if(i == 0){
               count++;
           }
            for(int j = 1; j < s.size(); j++){
                if(s.get(i).equals(s.get(j))){

                }else{
                    count++;
                    
                
                }
            }
        }
        System.out.println(count);
    }
}