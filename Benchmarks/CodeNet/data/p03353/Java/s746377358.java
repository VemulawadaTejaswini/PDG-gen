import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Set<String> set = new TreeSet<>();
        String s = scanner.next();
        int k = scanner.nextInt();
        for(int i = 0; i < s.length(); i++){
            for(int j = i+1; j < s.length()+1; j++){
                set.add(s.substring(i,j));
            }
        }
        int count = 1;
        for(String cur : set){
            if(count == k){
                System.out.println(cur);
            }
            count++;
        }
    }
}
