import java.util.*;

class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String b = sc.next();
        Base(b);
        //System.out.println(Base());
    }
    private static void Base(String b){
        b = b.replace('A', 'T');
        b = b.replace('C', 'G');
        b = b.replace('T', 'A');
        b = b.replace('G', 'C');
        System.out.println(b);
    }
}