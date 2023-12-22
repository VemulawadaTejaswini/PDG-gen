import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    Scanner in = new Scanner(System.in);

    void solve(){
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        while(in.hasNextLine()){
            String[] s = in.nextLine().split(" ");
            if(map.containsKey(s[0])){
                map.get(s[0]).add(s[1]);
            }else{
                map.put(s[0], new ArrayList<>(Arrays.asList(s[1])));
            }
        }
        String[] p = map.keySet().toArray(new String[map.size()]);
        Arrays.sort(p);
        for(String s : p){
            System.out.println(s);
            System.out.println(String.join(" ", map.get(s)));
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}