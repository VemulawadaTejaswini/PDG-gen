import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
        int a = sc.nextInt();
        String t;
        int d,e;
        StringBuffer sb;
        StringBuilder sb2;
        for(int i=0;i<a;i++){d = sc.nextInt();
                             if(d==1){sb = new StringBuffer(s);
                                      sb.reverse(); 
                                      s = sb.toString(); }
                             else{e = sc.nextInt(); 
                                  t = sc.next();
                                  sb2 = new StringBuilder();
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
