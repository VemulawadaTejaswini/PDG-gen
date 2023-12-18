import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    static boolean cal(String str){
        BigInteger a= new BigInteger(str);
        BigInteger b=new BigInteger("2019");
        if(a.mod(b).equals(BigInteger.ZERO))return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int cnt=0;
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                boolean ans=cal(str.substring(i,j));
                if(ans)cnt++;
            }
        }
        System.out.println(cnt);
    }
}