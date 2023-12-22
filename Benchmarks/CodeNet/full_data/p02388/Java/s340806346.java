import java.util.*;
public class Main{
    public static void main(String[] args){
        int buffernum = myGetInt();
        if(buffernum <= 100){
            System.out.println(buffernum*buffernum*buffernum);
        }    
    }
    static int myGetInt(){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}