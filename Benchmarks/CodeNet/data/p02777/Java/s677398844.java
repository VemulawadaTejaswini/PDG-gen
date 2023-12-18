

import java.util.*;

class Main {
    public static void main(String args[]){

        Scanner s=new Scanner(System.in);
        String u= s.next();
        String t= s.next();
        int a= s.nextInt();
        int b= s.nextInt();
        String v= s.next();
        if(v.equals(u)){
            System.out.println(a-1+" "+b);
        }else {
            System.out.println(a+" "+(b-1));

        }
    }

}