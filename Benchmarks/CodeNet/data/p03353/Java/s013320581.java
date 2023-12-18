import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();
        Set<String> ts = new TreeSet<>();
        for(int i = 0;i<s.length();i++){
            ts.add(s.substring(i,i+1));
            if(i + 1 < s.length()){
                ts.add(s.substring(i,i+2));
            }
            if(i + 2 < s.length()){
                ts.add(s.substring(i,i+3));
            }
            if(i + 3 < s.length()){
                ts.add(s.substring(i,i+3));
            }
            if(i + 4 < s.length()){
                ts.add(s.substring(i,i+4));
            }
        }
        Iterator it = ts.iterator();
        for(int i = 0;i<5;i++){
            if(i+1 == n){
                System.out.println(it.next());
                break;
            }else{
                it.next();
            }
        }
    }
}