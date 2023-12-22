import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
        int mod = 0;
        for(int i=0;i<s.length();i++){int a = (int)(s.charAt(i))-48;
                                      mod+=a;
                                      mod%=9;
                            }       
		if(mod==0){System.out.println("Yes");}
      else{System.out.println("No");}
	}
}