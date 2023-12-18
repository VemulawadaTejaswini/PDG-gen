import java.util.Scanner;

/**
 * Created by yangyuyin on 16/10/23.
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        boolean hasC=false;
        boolean result=false;
        for(int i=0;i<s.length;i++){
            if(s[i]=='C') hasC=true;
            else if(s[i]=='F'&&hasC) {
                result=true;
                break;
            }
        }
        if (result) System.out.print("YES");
        else System.out.print("NO");
    }
}
