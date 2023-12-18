import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] charAr = input.toCharArray();
        
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < charAr.length; i++){
            if(!map.containsKey(charAr[i])){
                map.put(charAr[i], 1);
            } else {
            	map.put(charAr[i], map.get(charAr[i]) + 1);
            }
        }
        if(map.size() == 2 && map.get(charAr[0]) == 2){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }
    }
}
