import java.util.Scanner;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();
        Map<Character,Integer> map1 = new HashMap<>();
        for(int i = 0;i < s1.length();i++){
            if(map1.containsKey(s1.charAt(i))){
                map1.put(s1.charAt(i),map1.get(s1.charAt(i))+1);
                continue;
            }
            map1.put(s1.charAt(i),1);
        }

        Map<Character,Integer> map2 = new HashMap<>();
        for(int i = 0;i < s2.length();i++){
            if(map2.containsKey(s2.charAt(i))){
                map2.put(s2.charAt(i),map2.get(s2.charAt(i))+1);
                continue;
            }
            map2.put(s2.charAt(i),1);
        }

        Map<Character,Integer> map3 = new HashMap<>();
        for(int i = 0;i < s3.length();i++){
            if(map3.containsKey(s3.charAt(i))){
                map3.put(s3.charAt(i),map3.get(s3.charAt(i))+1);
                continue;
            }
            map3.put(s3.charAt(i),1);
        }
        String str = "";
        for(Character key : map1.keySet()){
            int num1 = 0;
            int num2 = 0;
            int num3 = 0;
            if(map1.get(key) != null){
                num1 = map1.get(key);
            }
            if(map2.get(key) != null){
                num2 = map2.get(key);
            }
            if(map3.get(key) != null){
                num3 = map3.get(key);
            }
            int min = Math.min(num1,Math.min(num2,num3));
            for(int i = 0;i < min;i++){
                str += key;
            }
        }

        System.out.println(str);

    }
}
