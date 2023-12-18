import java.util.*;
public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int cnt = 0;
        for(int i =0; i<s.length(); i++){
            if(Character.isUpperCase(s.charAt(i))){
                cnt++;
            }
        }
        if(s.charAt(0)=='A'){
            if(s.charAt(0) == 'C' || s.charAt(1)=='C'|| s.charAt(2)=='C' ||
                s.charAt(s.length()-1) == 'C' || s.charAt(s.length()-2)=='C'){
                    if(cnt==2){
                        System.out.println("AC");
                        return;
                    }
            }
        }
        System.out.println("WA");
    }
}
