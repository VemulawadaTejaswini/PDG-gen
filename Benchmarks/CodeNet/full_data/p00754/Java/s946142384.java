import java.net.SocketPermission;
import java.util.Scanner;

/**
 * Created by Reopard on 2014/07/03.
 */
public class Main{
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args){
        char[] c = new char[100];
        char tmp;
        int p =0;
        String text;
        while(true){
            text = s.next();

            for(int i=0;i<text.length();i++){
                 tmp = text.charAt(i);

                if(tmp == '('){
                    c[p] = '(';
                    p++;
                } else if(tmp == '['){
                    c[p] = '[';
                    p++;
                } else if(tmp == ')'){
                    if(p>0 && c[p-1]=='('){
                        p--;
                    } else{
                        System.out.println("no");
                        p=0;
                        break;
                    }
                } else if(tmp == ']'){
                    if(p>0 && c[p-1]=='['){
                        p--;
                    } else{
                        System.out.println("no");
                        p=0;
                        break;
                    }
                } else if(tmp == '.'){
                    if(p == 0){
                        System.out.println("yes");
                        p=0;
                        if(i==0) System.exit(0);
                    } else {
                        System.out.println("no");
                        p=0;
                    }
                }

            }
        }
    }
}