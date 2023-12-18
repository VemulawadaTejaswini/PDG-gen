import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        Set<String> set = new HashSet<>();
        for(int i = 0; i < n-2; i++){
            for(int j = i+1; j < n-1; j++){
                for(int k = j+1; k < n; k++){
                    String cur = s.charAt(i) + "" + s.charAt(j) + ""+ s.charAt(k) + "";
                    set.add(cur);
                }
            }
        }
        System.out.println(set.size());
    }
}

