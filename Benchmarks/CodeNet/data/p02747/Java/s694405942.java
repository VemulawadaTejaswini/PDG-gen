import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int l = str.length();
        int i = 0;
        boolean ans = false;
        char h = 'h';
        char ii = 'i';

        while(ans != true){
            if(str.charAt(i) == h && i+1 != l){
                if(str.charAt(i+1) == ii){
                    ans = true;
                }
            }
            i++;
            if(i == l){
                break;
            }
        }
        String answer = "a";
        if(ans == true){
            answer = "Yes";
        }
        else{
            answer = "No";
        }
        System.out.println(answer);
    }
}