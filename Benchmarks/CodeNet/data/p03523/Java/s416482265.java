/*
 * 文字列 S が与えられます。
 * 
 * 高橋君はこの文字列の好きな位置に好きなだけ文字 A を挿入することができます。
 * 
 * S を AKIHABARA に変えることはできるでしょうか？
 */

import java.util.*;
	public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            //入力
            String s = sc.next();
            
            //出力
            if(s.charAt(0) == 'A'){
            	s = s.substring(1);
            }
            if(s.substring(0, 3).equals("KIH")){
           		s = s.substring(3);
           		if(s.charAt(0) == 'A'){
           			s = s.substring(1);
           		}
            	if(s.charAt(0) == 'B'){
            		s = s.substring(1);
            		if(s.charAt(0) == 'A'){
               			s = s.substring(1);
               		}
            		if(s.equals("R") || s.equals("RA")){
            			System.out.println("YES");
            			sc.close();
            			return;
                	}
            	}
            }
            System.out.println("NO");
            sc.close();
        }
    }
	