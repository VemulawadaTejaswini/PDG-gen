import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer,Integer> a = new HashMap<>();
        String ret = "YES";
        for(int i=0; i<n; i++){
            Integer wk = sc.nextInt();
            if(a.containsKey(wk)){
				ret = "NO";
                break;
            }else{
                a.put(wk,wk);
              
            }
        }
       System.out.println(ret);
    }
}