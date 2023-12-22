import java.util.Scanner;

public class Main{
    public static void main(String[]argc){
        Scanner sc = new Scanner(System.in);
        int[] count = new int[27];
        String s;
        while(sc.hasNext()){
            s = sc.next();
            s = s.toLowerCase();
            for(int i=0;i<s.length();i++){
                int w = s.charAt(i);
                if(w-'a'>=0&&w-'a'<26){
                    count[w-'a']++;
                }
            }   
        }
        for(int j=0;j<26;j++){
            char c = (char)('a'+j);
            System.out.println(c+" : "+count[j]);
        }
    }
}
