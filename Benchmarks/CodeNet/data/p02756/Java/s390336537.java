import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
        int a = sc.nextInt();
        String t;
        int d,e;
        StringBuffer sb = new StringBuffer(s);
        StringBuilder sb2 = new StringBuilder();
        for(int i=0;i<a;i++){d = sc.nextInt();
                             if(d==1){
                                      sb.reverse(); 
                                      s = sb.toString(); }
                             else{e = sc.nextInt(); 
                                  t = sc.next();                                 
                                 if(e==1){
                                          sb2.append(t);
                                          sb2.append(s);                                          
                                 }
                                 else{sb2.append(s);
                                     sb2.append(t);
                                     }
                                s = sb2.toString(); }
                            }      
		System.out.println(s);
	}
}
