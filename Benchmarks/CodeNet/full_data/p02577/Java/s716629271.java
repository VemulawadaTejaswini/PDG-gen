import java.util.Scanner;
import java.util.Arrays;


public class Main{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String n = sc.next();
        int s_length = n.length();
        String tmp2 = "";
        int tmp = 0;
        int sum = 0;
        for(int i=0; i<n.length(); i++){
            tmp2=n.substring(i,i+1);
            tmp=Integer.parseInt(tmp2);
            sum= sum+tmp;
        }
        if(sum%9==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
    }
}
}