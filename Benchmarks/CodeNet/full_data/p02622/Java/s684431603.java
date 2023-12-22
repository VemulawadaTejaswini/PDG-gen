import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        char[]s=sc.next().toCharArray();
        char[]t=sc.next().toCharArray();
        int sum=0;
        for(int i=0;i<s.length;i++){
            sum+=(s[i]==t[i])?0:1;
        }
        System.out.println(sum);
    }
}
