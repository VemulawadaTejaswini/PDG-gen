import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int a,b;
        int ans;
        String ob;
        Scanner scan = new Scanner(System.in);
        while(true){
        a = scan.nextInt();
        ob = scan.next();
        b = scan.nextInt();
        if(ob.equals("+"))ans = a+b;
        else if(ob.equals("-"))ans = a-b;
        else if(ob.equals("*"))ans  = a *b;
        else if(ob.equals("/"))ans=a/b;
        else break;
        System.out.println(ans);
        }
        scan.close();
    }   
}
