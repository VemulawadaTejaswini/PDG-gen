import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
        int d=b+c-a;
        if(d<0){
            if(b>c){
                System.out.println(c+" "+0);   
            }else{
                System.out.println(b+" "+0);                
            }
        }else{
            if(b>c){
                    System.out.println(c+" "+d);   
                }else{
                    System.out.println(b+" "+d);                
                }
            }
	    }
	}
