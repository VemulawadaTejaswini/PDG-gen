import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int w = 0;
		String s = sc.next();
        int ans = 0;
        for(int i=0;i<a;i++){if(s.charAt(i)=='W'){w++;}
                            }
        int k = w;
        for(int i=0;i<k;i++){if(s.charAt(i)=='W'){ans++;}
                             }
		System.out.println(ans);
	}
}