import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        // 文字列の入力
		String in = sc.next();

        String[] dow = {"SUN","MON","TUE","WED","THU","FRI","SAT"};

        int i;
        for(i = 0; i < dow.length; i++){    

            if(in.equals(dow[i])){ 
                break;
            }
            
        }
         
        // 出力
            System.out.println(7 - i);   
	}
}