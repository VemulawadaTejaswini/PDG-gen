import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		int b = 1;
        int c = 0;
        for(int i=0;i<a.length();i++){if(a.charAt(i)=='1' || a.charAt(i)=='9'){b++;}if(a.charAt(i)=='9'){c++;}else{c=0;}
                                      if(a.charAt(i)=='2'|| a.charAt(i)=='8'){b+=2;
                                                 }if(a.charAt(i)=='3'|| a.charAt(i)=='7'){b+=3;
                                                 }if(a.charAt(i)=='4' || a.charAt(i)=='6'){b+=4;}
                                      if(a.charAt(i)=='5'){b+=5;}if(i==a.length()-1 && (a.charAt(i)=='9')){b-=Math.max(0,c-1);}
                                     if(i==a.length()-1 && (a.charAt(i)=='0')){b--;}
                                     }        
		System.out.println(b);
	}
}
