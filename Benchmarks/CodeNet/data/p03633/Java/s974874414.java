import java.math.BigInteger;
import java.util.*;  

/*求最大公约数和最小公倍数*/  
public class Main {  
  
    public static void main(String[] args) {  
        Scanner cin = new Scanner(System.in);// 接收控制台输入的信息  
        int n;
        n = cin.nextInt();
        
        BigInteger ans = BigInteger.valueOf(1);
        for(int i=1 ;i<=n ;i++) {
        	BigInteger x;
        	x = cin.nextBigInteger();
        	ans = ans.divide(F(ans,x));
        	ans = ans.multiply(x);
        }
        System.out.println(ans);
    }  
  
   
    public static BigInteger F(BigInteger m, BigInteger n) {  
        while (!(n.mod(m).equals(0))) {// 在余数不能为0时,进行循环  
            BigInteger tem = n.mod(m);  
            n = m;
            m = tem;  
        }  
        return n;// 返回最大公约数  
    }  
}  