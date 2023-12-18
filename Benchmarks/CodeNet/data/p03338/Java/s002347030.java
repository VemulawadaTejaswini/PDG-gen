import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        char[] c = s.toCharArray();
        int maxcnt = 0;
        for(int i = 0;i < n;i++){
            String str1 = s.substring(0,i+1);
            String str2 = s.substring(i+1);
            char[] c1 = str1.toCharArray();
            char[] c2 = str2.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            int cnt = 0;
            //Map<Character,Integer> map1 = new HashMap<Character,Integer>();
            //Map<Character,Integer> map2 = new HashMap<Character,Integer>();
            //for(int j = 0;j < c1.length;j++){
            //    map1.put(c1[j],1);
            //}
            //for(int j = 0;j < c2.length;j++){
            //    map2.put(c2[j],1);
            //}
            //System.out.println(Arrays.toString(c1));
            //System.out.println(Arrays.toString(c2));
            //for(Character str : map1.keySet()){
            //    for(Character val : map2.keySet()){
            //        if(map2.containsKey(map1.get(str))){
            //            cnt++;
            //        }
            //    }
            //}
            for(int j = 0;j < c1.length;j++){
                if(j < c1.length -1 && c[j] == c[j+1]){
                    continue;
                }
                for(int k = 0;k < c2.length;k++){
                    if(c1[j] == c2[k]){
                        cnt++;
                        break;
                    }
                }
            }
            //System.out.println("str1 = " + str1);
            //System.out.println("str2 = " + str2);
            //System.out.println(Arrays.toString(c1));
            //System.out.println(Arrays.toString(c2));
            //System.out.println("cnt = " + cnt);
            maxcnt = Math.max(maxcnt,cnt);
        }
        System.out.println(maxcnt);
    }
}
