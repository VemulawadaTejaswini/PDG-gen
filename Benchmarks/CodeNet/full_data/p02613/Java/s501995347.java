import java.util.*;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String[]s = new String[N];
    
    int a=0, w=0, t=0, r=0;
    for(int i=0; i<N; i++){
        s[i]=sc.next();
        if(s[i].equals("AC")){
           a++;
        }else if(s[i].equals("WA")){
            w++;
        }else if(s[i].equals("TLE")){
            t++;
        }else if(s[i].equals("RE")){
            r++;
        }
}
    System.out.println("AC x "+a);
    System.out.println("WA x "+w);
    System.out.println("TLE x "+t);
    System.out.println("RE x "+r);
        
    }

}

