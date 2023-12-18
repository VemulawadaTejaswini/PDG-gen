
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a = sc.next(),b=sc.next(),c=sc.next();
        int ptA=0,ptB=0,ptC=0;

        char next = 'a';
        while(true){
            if(next == 'a'){
                if(ptA==a.length())break;
                next=a.charAt(ptA);
                ptA++;

            }else if(next =='b'){
                if(ptB==b.length())break;
                next=b.charAt(ptB);
                ptB++;

            }else{
                if(ptC==c.length())break;
                next = c.charAt(ptC);
                ptC++;

            }
        }

        if(next =='a')next='A';
        else if(next=='b')next='B';
        else next='C';
        System.out.println(next);




    }
}
