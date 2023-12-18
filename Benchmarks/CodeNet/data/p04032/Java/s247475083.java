import java.util.ArrayList;
import java.util.Scanner;

class Main {

    static int MAXN = 256;


    static boolean checkHalfFrequency(String str)
    {

        // Length of the string
        int L = str.length();

        // Initialize a frequency array
        int fre[] = new int[MAXN];

        // Iterate the string and update the
        // frequency of each of the character
        for (int i = 0; i < L; i++)
        {
            fre[str.charAt(i)]++;
        }

        // Iterate the frequency array
        for (int i = 0; i < MAXN; i++) // If condition is satisfied
        {
            if (fre[i] > L / 2)
            {
                return true;
            }
        }

        return false;
    }

    static ArrayList<String> subString(char str[], int n) {
        // Pick starting point
        ArrayList<String> result = new ArrayList<String>();
        String add="";
        for (int len = 1; len <= n; len++) {
            // Pick ending point
            for (int i = 0; i <= n - len; i++) {
                //  Print characters from current
                // starting point to current ending
                // point.
                int j = i + len - 1;
                for (int k = i; k <= j; k++) {
                    add+=str[k];
                    result.add(add);
                }
            }
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner inp =  new Scanner(System.in);
        String input;

        input=inp.nextLine();

        char[] ch = input.toCharArray();
        String result="";
        ArrayList<String> subs = subString(ch,ch.length);
        for(int i =0 ;i<subs.size();i++){
            if(subs.get(i).length()>=2){
            if(checkHalfFrequency(subs.get(i))){
                result = subs.get(i);
                break;
            }}

        }
        if(result.equals("")){
            System.out.println("-1"+" "+"-1");
        }
        else{
            int min=input.indexOf(result)+1;
            int max=input.indexOf(result)+result.length();
            System.out.println(min+" "+max);
        }
        
    }
}