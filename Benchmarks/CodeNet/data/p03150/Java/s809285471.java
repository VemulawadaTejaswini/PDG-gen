import java.util.*;
public class Main{
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = "keyence";
        String ans="NO";
        int l=0;
        int cou=0;
        boolean flg=false;
        for (int i=0;i<a.length();i++) {
            char c = a.charAt(i);
            char d = b.charAt(l);
            if(c==d){
                flg=true;
                l++;
                if(l==b.length()){
                    ans="YES";
                    break;
                }
            }else{
                if(flg){
                    cou++;
                    flg=false;
                }
                if (cou==2) {
                    break;
                }
            }
        }
        System.out.println(ans);
	}
}