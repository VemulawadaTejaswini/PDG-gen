import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
        int a = sc.nextInt();
        int b = 1;
        String t;
        String u = " ";
        String v = " ";
        int d,e;
        for(int i=0;i<a;i++){d = sc.nextInt();
                             if(d==1){b*=-1;
                                     }
                             else{e = sc.nextInt(); 
                                  t = sc.next();
                                  if(b==1){if(e==1){
                                          v+=s;                                                                                 
                                 }
                                 else{u+=t;
                                     }
                                         }
                                  else{if(e==1){
                                    u+=t; 
                                  }
                                 else{v+=s;                                        
                                     }
                                      }
                               }
                            }
         s = u + s + v;
         StringBuffer sb = new StringBuffer(s);
         if(b==-1){sb.reverse(); 
                   s = sb.toString();}
		System.out.println(s);
	}
}
