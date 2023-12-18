import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 入力
		String a = sc.next();
       	// 1の場合、加算
      	int b = 0;
      	if (a.subStiring(0,1).equals("1")){
        b += 1;
        }
      	if (a.subStiring(1,2).equals("1")){
        b += 1;
        }
      	if (a.subStiring(2,3).equals("1")){
        b += 1;
        }
		System.out.println(b);
	}
}