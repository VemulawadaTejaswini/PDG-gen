import java.util.*;
 
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String s = sc.next();
        int n[] = new int[4];
        String ans = "";
        for(int i = 0; i < 4; i++){
        	n[i] = Integer.parseInt(s.substring(i, i + 1));
        }
        if(n[0] + n[1] + n[2] + n[3] == 7){
        	ans = n[0] + "+" + n[1] + "+" + n[2] + "+" + n[3];
        }else if(n[0] + n[1] + n[2] - n[3] == 7){
        	ans = n[0] + "+" + n[1] + "+" + n[2] + "-" + n[3];
        }else if(n[0] + n[1] - n[2] + n[3] == 7){
        	ans = n[0] + "+" + n[1] + "-" + n[2] + "+" + n[3];
        }else if(n[0] - n[1] + n[2] + n[3] == 7){
        	ans = n[0] + "-" + n[1] + "+" + n[2] + "+" + n[3];
        }else if(n[0] + n[1] - n[2] - n[3] == 7){
        	ans = n[0] + "+" + n[1] + "-" + n[2] + "-" + n[3];
        }else if(n[0] - n[1] + n[2] - n[3] == 7){
        	ans = n[0] + "-" + n[1] + "+" + n[2] + "-" + n[3];
        }else if(n[0] - n[1] - n[2] + n[3] == 7){
        	ans = n[0] + "-" + n[1] + "-" + n[2] + "+" + n[3];
        }else if(n[0] - n[1] - n[2] - n[3] == 7){
        	ans = n[0] + "-" + n[1] + "-" + n[2] + "-" + n[3];
        }
        System.out.println(ans + "=7");
    }
}