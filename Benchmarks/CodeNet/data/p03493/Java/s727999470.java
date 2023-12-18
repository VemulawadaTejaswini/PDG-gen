import java.util.Scanner;

//-------------------------
// 
//-------------------------

public class Main {
    public static void main(String[] args) {
        
        char[] s = new char[3];
        int output=0;

        Scanner scan = new Scanner(System.in);
        String S = scan.next();
        scan.close();

        for(int i=0; i<3; i++)
        {
            s[i] = S.charAt(i);
            if(s[i]=='1') output++;
        }

        System.out.println(output);
    }
}