import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);		
		String str = sc.next();
        int s = 0;
		int t = 0;
        int st1 = 0;
        int st2 = 0;
        for(int i=1;i<str.length();i+=2){if(st1==0 && str.substring(i-1,i+1).equals("ST")){} 
                                         else{st1++;if(str.substring(i-1,i+1).equals("TT")){t+=2;}
                                             else{if(str.substring(i-1,i+1).equals("TS")){t++;break;}
                                                  else{break;}
                                                 }
                                            }
                                        }
        for(int i=str.length()-1;i>=1;i-=2){if(st2==0 && str.substring(i-1,i+1).equals("ST")){} 
                                         else{st2++;if(str.substring(i-1,i+1).equals("SS")){s+=2;}
                                             else{if(str.substring(i-1,i+1).equals("TS")){s++;break;}
                                                  else{break;}
                                                 }
                                            }
                                           }
		System.out.println(Math.max(2*s,2*t));
	}
}
