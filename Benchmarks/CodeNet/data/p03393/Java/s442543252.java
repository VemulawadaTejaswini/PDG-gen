import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        
        int[] letterIndex = new int[26];
        int numChars = s.length();
        for(int i = 0; i < numChars; i++)
        {
            letterIndex[s.charAt(i) - 'a']++;
        }
        
        int nextLowestChar = -1,
            i = 0;
        while(i < 26 && letterIndex[i] != 0)
            i++;
        if(i < 26)
        {
            nextLowestChar = i + 'a';
            System.out.println(s + (char)nextLowestChar);
        }
        else
        {
            i = numChars - 1;
            nextLowestChar = s.charAt(i);
            while(i >= 0 && nextLowestChar <= s.charAt(i))
                i--;
            
            if(i >= 0)
            {
                System.out.println(s.substring(0, i) + (char)nextLowestChar);
            }
            else
                System.out.println(-1);
        } 
    }
}