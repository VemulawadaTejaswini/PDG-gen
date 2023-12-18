import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		char a = sc.next();
		char b = 'a';
		String s = "abcdefghijklmnopqrstuvwxyz";
       
        for(int i=0;i<25;i++){if(a == s.charAt(i)){b=s.charAt(i+1);break;
                                                 }
                            }
      
		System.out.println(b);
	}
}
