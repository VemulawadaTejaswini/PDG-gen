import java.util.Scanner;

public class Main {
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String T = sc.next();
        StringBuilder strb = new StringBuilder();
        boolean last = false;

        for (int i = 0; i < T.length() - 1; i++) {
            switch (T.charAt(i)) {
                case 'P':
                    if(T.charAt(i+1) == '?'){
                        strb.append("PD");
                        i++;
                    }else{
                        strb.append(T.charAt(i));
                    }
                    break;
                case 'D':
                    strb.append(T.charAt(i));
                    break;
                case '?':
                    if (T.charAt(i + 1) == '?') {
                        strb.append("PD");
                        i++;
                    } else if (T.charAt(i + 1) == 'D') {
                        strb.append('P');
                    } else {
                        strb.append('D');
                    }
                    break;
            }
            if (i == T.length() - 1) {
                last = true;
            }
        }
        if (!last) {
            switch (T.charAt(T.length() - 1)) {
                case 'P':
                case 'D':
                    strb.append(T.charAt(T.length() - 1));
                    break;
                case '?':
                    strb.append('D');
                    break;
            }
        }
        System.out.println(strb.toString());
    }
}