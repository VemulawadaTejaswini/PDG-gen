import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=0;
        int b=0;
        int ab=0;
        String tmp;
        int ba=0;
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            tmp=sc.next();
            if(tmp.charAt(0)=='B')b++;
            if(tmp.charAt(tmp.length()-1)=='A')a++;
            if(tmp.charAt(0)=='B'&&tmp.charAt(tmp.length()-1)=='A')ba++;
            ab+=(tmp.length()-tmp.replaceAll("AB","").length())/2;
        }
        if(ba==b&&ba==a){
            System.out.println(a+ab-1);
        }else{
            System.out.println(ab+Math.min(a,b));
        }
    }
}