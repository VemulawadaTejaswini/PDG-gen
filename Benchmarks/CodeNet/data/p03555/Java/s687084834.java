import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        String a = sc.next();
		String b = "YES";
		String c = "NO";
        String d = sc.next();
		String [] ksb = String.valueOf(a).split("");
		String [] ksc = String.valueOf(d).split("");
		
       	if((ksb[0].equals(ksc[2])) && (ksb[1].equals(ksc[1])) && (ksb[2].equals(ksc[0]))) {
       		System.out.println(b); 
       	}else { 
       		System.out.println(c);
       	}
    }
}


