import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		String a = sc.next();
		String b = sc.next();

      	if(a.equals(b)){
            System.out.println("H");   
        }else{
            System.out.println("D");   
        }
    }
}