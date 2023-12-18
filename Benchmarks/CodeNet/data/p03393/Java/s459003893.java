import java.util.*;
class Abc
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] c = new char[26];
        for(int i = 0; i < s.length(); i++)
            c[s.charAt(i) - 'a']++;
            char next = 'a';
        for(char i = 0; i < s.length(); i++){
            if(c[i] == 0){
                next += (char)i;
                System.out.println(s + next);
                return;
            }
        }
        System.out.print(-1);
    }
}