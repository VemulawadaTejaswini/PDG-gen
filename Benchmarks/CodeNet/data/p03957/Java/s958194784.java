import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		// 出力
        boolean cok = false;
        boolean fok = false;
        for(int i=0; i<s.length, i++){
            if(s.charAt(i).equals("C")){
                if(cok = false){
                cok = true;
                }
            }
            else if(cok = true && s.charAt(i).equals("F")){
                fok = true;
            }
        }
        if(fok){
		System.out.println("Yes");
        }
        else{
System.out.println("No");
        }
	}
}