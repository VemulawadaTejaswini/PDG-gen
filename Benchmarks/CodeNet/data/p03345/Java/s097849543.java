
import java.util.*;
	public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            //入力
            long a = Long.parseLong(sc.next());
            long b = Long.parseLong(sc.next());
            Integer.parseInt(sc.next());
            long k = Long.parseLong(sc.next()), ret;
            
            if(k%2 == 0){
            	ret = a-b;
            }else{
            	ret = b-a;
            }
            System.out.println(ret);
            
            sc.close();
        }
    }
	