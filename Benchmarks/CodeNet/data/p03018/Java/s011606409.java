import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 文字列の入力
		String s = sc.next();
        sc.close();
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        int counter = 0;
        int i = 0;
        int icounter = 0;
        int icounter2 = 0;
        int icounter3 = 0;

        if(s.length()<2){
            counter = 0;
        } else{
        while(s.length()-2>i){   
                    
            if(sb.charAt(i)=='A' && sb.charAt(i+1)=='B' && sb.charAt(i+2)=='C'){
                sb.replace(i, i+3, "BCA");
                counter++;
                icounter3 = icounter2;
                icounter2 = icounter;
                icounter = i;
                i = icounter3;
            }
        
            i++;
        }
        }
    

		// 出力
		System.out.println(counter);
    }
    
}
