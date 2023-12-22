import java.util.Scanner;
 
public class Main{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        String ss=in.nextLine();
        char ch[]=ss.toCharArray();
        String c="";
        for (int i = 0; i < ch.length-1; i++) {
            c=c+ch[i];
        }
        if(c.equals(s)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}