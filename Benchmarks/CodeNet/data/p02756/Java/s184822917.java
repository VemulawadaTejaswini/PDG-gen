import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
        int a = sc.nextInt();
		String [] str = new String [a+1];
        str[0] = s;
        String t;
        int d,e;
        StringBuffer sb;
        for(int i=0;i<a;i++){d = sc.nextInt();
                             if(d==1){sb = new StringBuffer(str[i]);
                                      sb.reverse(); 
                                      str[i+1] = sb.toString(); }
                             else{e = sc.nextInt(); t = sc.next();
                                 if(e==1){str[i+1] = t + str[i];}
                                 else{str[i+1] = str[i] + t;}
                                 }
                            }      
		System.out.println(str[a]);
	}
}