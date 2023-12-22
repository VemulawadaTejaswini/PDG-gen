import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int result[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        String alphabet[] = {"abcdefghijklmnopqrstuvwxyz"};
        while(sc.hasNext())
        {
            String str = sc.next();
            str = str.toLowerCase();
            for(int i = 0 ; i < str.length() ; i++)
            {
                if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
                    result[str.charAt(i) - 'a']++;
            }
        }
        for(int i = 0 ; i < 26 ; i++)
            System.out.println(alphabet[i] + " : " + result[i]);
    }
}
