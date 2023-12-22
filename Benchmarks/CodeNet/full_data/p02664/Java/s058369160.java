import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String t = sc.next();
        StringBuilder ans = new StringBuilder();

        for(int i = 0; i < t.length(); i++){
            switch(t.charAt(i)){
                case 'P':
                    ans.append('P');
                    break;
                case 'D':
                    ans.append('D');
                    break;
                case '?':
                    if(i > 0 && t.charAt(i - 1) == 'P'){
                        ans.append('D');
                    }else if(i < t.length() - 1 && t.charAt(i + 1) == 'P'){
                        ans.append('D');
                    }else if(i > 0 && ans.charAt(i - 1) == 'P'){
                        ans.append('D');
                    }else if(i < t.length() - 1 && t.charAt(i + 1) == '?'){
                        ans.append('P');
                    }else if(i < t.length() - 1 && t.charAt(i + 1) == 'D'){
                        ans.append('P');
                    }else{
                        ans.append('D');
                    }

            }
        }

        System.out.println(ans);

    }
}
