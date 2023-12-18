import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        int n=s.length();
        boolean ans=true;
        for(int i=0;i<n;i++){
            if(s.charAt(i)!=s.charAt(n-i-1)){
                ans=false;
            }
        }
        for(int i=0;i<(n-1)/2;i++){
            if(s.charAt(i)!=s.charAt((n-1)/2-i-1)){
                ans=false;
            }
        }
        for(int i=0;i<(n-1)/2;i++){
            if(s.charAt(n-i-1)!=s.charAt((n+1)/2+i)){
                ans=false;
            }
        }
        System.out.println(ans?"Yes":"No");

    }

}