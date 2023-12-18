
import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
        solve();
    }

    public static void solve(){
        Scanner sc = new Scanner(System.in);
 		String s = sc.next();
 		boolean flag = true;
 		for(int i=0;i<s.length()-1;i++){
 			if(s.charAt(i)==s.charAt(i+1)){
 				flag = false;
 			}
 		}       
 		if(flag){
 			System.out.println("Good");
 		}
 		else{
 			System.out.println("Bad");
 		}
    }
}