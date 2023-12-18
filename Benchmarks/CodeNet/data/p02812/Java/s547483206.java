import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String s = sc.next();
        int b = 0;
        for(int i=0;i<a-2;i++){if(s.substring(i,i+3).equals("ABC")){b++;
                                                 }
                            }
       
		System.out.println(b);
	}
}
