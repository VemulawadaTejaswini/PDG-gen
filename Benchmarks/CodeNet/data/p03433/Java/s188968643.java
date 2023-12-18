import java.util.*;
	public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            //入力
            int n = Integer.parseInt(sc.next());
            int a = Integer.parseInt(sc.next());
            
            //出力
            if(n%500 > a){
            	System.out.println("No");
            }else{
            	System.out.println("Yes");
            }
            sc.close();
        }
    }