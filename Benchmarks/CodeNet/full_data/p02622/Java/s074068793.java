import java.util.Scanner;

public class Main{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        String  s = scanner.nextString();
        String t = scanner.nextString();

        Char[] s_a = s.toCharArray();
        Char[] t_a = t.toCharArray();

        int count = 0;
        
        for(int i = 0; i <= s_a.length() -1; i++ ){
            if(!s_a[i].equals(t_a[i]){
                count +=1;
            }
        }
        System.out.println(count);
    }
}
