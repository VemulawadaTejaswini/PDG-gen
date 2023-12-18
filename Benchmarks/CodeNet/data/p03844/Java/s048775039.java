import java.util.*;
 class  Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        String c = in.next();
        if(b.equals("+")){
            System.out.println(Integer.parseInt(a)+Integer.parseInt(c));
        }
        else {
            System.out.println(Integer.parseInt(a)-Integer.parseInt(c));
        }
    }


 }