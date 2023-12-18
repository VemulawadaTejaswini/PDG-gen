import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String[] s=new String[4];
        for(int i=0;i<4;i++){
            s[i]="";
        }
        s[0]=sc.next();
        s[1]+=s[0].charAt(0);
        for(int i=1;i<n;i++){
            if(s[0].charAt(i-1)!=s[0].charAt(i)){
                s[1]+=s[0].charAt(i);
            }
        }
        for(int i=0;i<s[1].length()-1;i++){
            s[2]+=Integer.toString(Math.abs(s[1].charAt(i+1)-s[1].charAt(i)));
        }
        for(int i=1;i<s[2].length();i++){
            if(s[2].charAt(i-1)!=s[2].charAt(i)){
                s[3]+=s[2].charAt(i);
            }
        }
        if(s[3].length()==1){
            System.out.println(1);
        }else{
            System.out.println(0);
        }

    }

}