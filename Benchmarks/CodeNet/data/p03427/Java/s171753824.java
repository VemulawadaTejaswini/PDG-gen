import java.util.*;

class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(s.length() == 1) {
            System.out.println(s);
        } else {
            String out = "";
            int index = -1;
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) != '9') {
                    index = i;
                    break;
                }
            }
            if(index == -1) {
                out = s;
            } else if(index == 0) {
                int b = 0;
                for(int i = 0; i < s.length(); i++) {
                    if(s.charAt(i) != '9') b++;
                }
                if(b == 1) {
                    out = s;
                } else {
                    out += String.valueOf((char)(s.charAt(index) - 1));
                    for(int i = index + 1; i < s.length(); i++) {
                        out += "9";
                    }
                }

                
            } else {
                out = s.substring(0,index-1);
                out += String.valueOf((char)(s.charAt(index-1) - 1));
                for(int i = index; i < s.length(); i++) {
                    out += "9";
                }
            }
            int ans = 0;
            for(int i = 0; i < s.length(); i++) {
                ans += out.charAt(i) - '0';
            }
            System.out.println(ans);
        }

    }
}

