import java.util.*;
import static java.lang.Math.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        char s[] = new char[n+3];
        boolean flag = true;
        boolean temp = false;
        s = sc.next().toCharArray();
        for(int i = b; i<=d-2; i++){
            if(s[i] == '#' && s[i+1] == '#'){
                flag = false;
            }
            if(s[i-1] == '.' && s[i] == '.' && s[i+1] == '.'){
                temp = true;
            }
        }

        if(temp){
            flag = true;
        }else if(!temp && flag && d<c){
            flag = false;
        }else if(!temp && flag){
            flag = true;
        }
        else{
            flag = false;
        }
        // for(int i=a; i<=c-1; i++){ && s[i+1] == '.'
        //     if(s[i] == '#' && s[i+1] == '#'){
        //         flag = false;
        //     }
        // }
        if(flag){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
