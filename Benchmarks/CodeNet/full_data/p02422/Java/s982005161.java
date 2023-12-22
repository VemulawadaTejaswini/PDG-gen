
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner=new Scanner(System.in);
        String str=scanner.next();
        int q=scanner.nextInt();
        for(int i=0;i<q;i++){
            String m=scanner.next();
            if(m.equals("print")){
                int a=scanner.nextInt();
                int b=scanner.nextInt();
                System.out.println(str.substring(a,b+1));
            }else if(m.equals("reverse")){
                int a=scanner.nextInt();
                int b=scanner.nextInt();
                str=str.substring(0,a)+(new StringBuffer(str.substring(a,b+1))).reverse().toString()+str.subSequence(b+1,str.length());
            }else{
                int a=scanner.nextInt();
                int b=scanner.nextInt();
                String p=scanner.next();
                str=str.substring(0,a)+p+str.subSequence(b+1,str.length());
            }
        }
    }

}

