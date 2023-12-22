import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String t = sc.next();
        String ans = "";

        for(int i = 0; i < t.length(); i++){
            switch(t.charAt(i)){
                case 'P':
                    ans += 'P';
                    break;
                case 'D':
                    ans += 'D';
                    break;
                case '?':
                    if(i > 0 && t.charAt(i - 1) == 'P'){
                        ans += 'D';
                    }else if(i < t.length() - 1 && t.charAt(i + 1) == 'P'){
                        ans += 'D';
                    }else if(i > 0 && ans.charAt(i - 1) == 'P'){
                        ans += 'D';
                    }else if(i < t.length() - 1 && t.charAt(i + 1) == '?'){
                        ans += 'P';
                    }else if(i < t.length() - 1 && t.charAt(i + 1) == 'D'){
                        ans += 'P';
                    }else{
                        ans += 'D';
                    }

            }
        }

        System.out.println(ans);

    }
}
