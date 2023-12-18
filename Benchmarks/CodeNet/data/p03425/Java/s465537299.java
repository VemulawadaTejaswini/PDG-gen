import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<String,Integer> namelist = new HashMap<String,Integer>();
        String s = "MARCH";
        for(int i = 0;i<s.length();i++){
            namelist.put(String.valueOf(s.charAt(i)), 0);
        }
        for (int i = 0; i < n; i++) {
            String name = String.valueOf(sc.next().charAt(0));
            if(namelist.containsKey(name)){
                namelist.put(name,namelist.get(name)+1);
            }
        }
        
        long ans=0;
        
        for(int i =0;i<s.length()-2;i++){
            int a = namelist.get(String.valueOf(s.charAt(i)));
            for(int j=i+1;j<s.length()-1;j++){
                int b = namelist.get(String.valueOf(s.charAt(j)));
                for(int k = j+1;k<s.length();k++){
                    int c = namelist.get(String.valueOf(s.charAt(k)));
                    ans += a*b*c;
                }
            }
        }
        System.out.println(ans);
    }
}