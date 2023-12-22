import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       // 文字列の入力
        String N = sc.next();
      
        char a="1";
        char b="2";      
        char c="3";
        char d="4";
        char e="5";      
        char f="6";
        char g="7";
        char h="8";

		int aa(String N, char a){
    		return str.length() - str.replace(a + "", "").length();
		}
		int bb(String N, char b){
    		return str.length() - str.replace(b + "", "").length();
		}
		int cc(String N, char c){
    		return str.length() - str.replace(c + "", "").length();
		}
		int dd(String N, char d){
    		return str.length() - str.replace(d + "", "").length();
		}      
		int ee(String N, char e){
    		return str.length() - str.replace(e + "", "").length();
		}
		int ff(String N, char f){
    		return str.length() - str.replace(f + "", "").length();
		}
		int gg(String N, char g){
    		return str.length() - str.replace(g + "", "").length();
		}
		int hh(String N, char h){
    		return str.length() - str.replace(h + "", "").length();
		}
        
      	int S= aa+(2*bb)+(3*cc)+4*dd+5*ee+6*ff+7*gg+8*hh;
        if(S%9==0){
        	System.out.println("Yes");
        } else{
        	System.out.println("No");        
        }

    }
}