import java.io.PrintWriter;
import java.util.*;

public class Main{


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        PrintWriter out=new PrintWriter(System.out);

        String s=sc.next();
        int n=s.length();
        int ans=0;
        int count=0;
        for (int i = 0; i <n ; i++) {
            if(f(s.charAt(i))){
                count++;
                if(ans<count)ans=count;
            }
            else{
                count=0;
            }
        }
        if(count>ans)ans=count;
        out.println(ans);

        out.close();
    }

    static boolean f(char a){
        if(a=='A' || a=='C' || a=='G' || a=='T')return true;
        else return false;
    }



}