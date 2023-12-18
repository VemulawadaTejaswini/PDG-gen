import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = Integer.parseInt(sc.next());
        int L = Integer.parseInt(sc.next());
        
        
        ArrayList<String> dictionary = new ArrayList<String>();
        for(int i=0; i<N; i++){
            dictionary.add(sc.next());
        }
        
        Collections.sort(dictionary);
        
        String ans = "";
        for(int i=0; i<N; i++){
            ans += dictionary.get(i);
        }
        
        System.out.println(ans);
    }
}