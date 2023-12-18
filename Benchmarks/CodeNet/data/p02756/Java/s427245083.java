import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
        int a = sc.nextInt();
        String t;
        int d,e;
        StringBuffer sb = new StringBuffer(s);
        for(int i=0;i<a;i++){d = sc.nextInt();
                             if(d==1){
                                      sb.reverse(); 
                                      s = sb.toString(); }
                             else{e = sc.nextInt(); 
                                  t = sc.next();
                                 if(e==1){t+=s;
                                          s=t;                                                                                 
                                 }
                                 else{s+=t;
                                     }
                                 }
                            }      
		System.out.println(s);
	}
}
