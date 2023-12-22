import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        var sc = new Scanner(System.in);
    
        long n = Long.parseLong(sc.next());
    
        long a = 26;
        long b = 26*26;
        int c = 1;
        long d = n-1;
        while(a < n){
            d = n-a-1;
            a += b;
            b *= 26;
            c++;
        }
        
        String s = Long.toString(d, 26);
        var sb = new StringBuilder();
        for(int i = s.length(); i < c; i++){
            sb.append('a');
        }
        for(int i = 0; i < s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                char e = (char)('a' + Integer.parseInt(s.substring(i, i+1)));
                sb.append(e);
            }else{
                char e = (char)(s.charAt(i) +10);
                sb.append(e);
            }
        }
        System.out.println(sb);
    }
}