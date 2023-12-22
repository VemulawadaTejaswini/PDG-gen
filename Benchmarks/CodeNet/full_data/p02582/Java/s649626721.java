import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();
        String c = sc.next();

		int n;
        n=0;
        
        if(a==R){
        	n=1;
            if(b==R){
            	n=2;
                if(n==3){
                	n=3;
                }
            }
        }else{
        if(b==R){
        	n=1;
            if(c==R){
            	n=2;
            }
        }
		}
        if(a==S&&b==S&&c==R){
        	n=1;
        }

// 出力
        System.out.println(n);
    }
}