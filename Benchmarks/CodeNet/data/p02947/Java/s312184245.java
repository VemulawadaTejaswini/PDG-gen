import java.util.*;
 
class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        String[] s = new String[n];
        long answer = 0;
        for(int  i = 0; i < n; i++){
            char[] c = new char[10];
            s[i] = stdIn.next();
            c = s[i].toCharArray();
            Arrays.sort(c);
            s[i] = new String(c);
        }

        int start = 0;
        long count = 0;
        boolean first = true;
        for(int i = start; i < n - 1 && s[i].length()== 10;i++){
            s[i] += "!";
            for(int j = i + 1; j < n; j++){
                if(s[i].contains(s[j])){
                    count++;
                    s[j] += "!";
                } 
                else if(first && s[j].length() == 10){
                    start = j;
                    first = false;
                } 
            }
            answer += count*(count+1)/2;
            first = true;
            count = 0;
        } 
        System.out.println(answer);
   }
}