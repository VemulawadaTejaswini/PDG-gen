import java.util.*;

public class Main{
    Scanner in = new Scanner(System.in);

    void solve(){
        int n = Integer.parseInt(in.nextLine());
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            list.add(in.nextLine());
        }
        list.stream().map(s -> s.replaceAll("Hoshino", "Hoshina")).forEach(System.out::println);
    }
    
    public static void main(String[] args){
        new Main().solve();    
    }
}