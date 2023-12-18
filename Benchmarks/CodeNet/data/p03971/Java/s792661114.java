import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
        int n = sc.nextInt();
		int a = sc.nextInt();
		// スペース区切りの整数の入力
		int b = sc.nextInt();
		// 文字列の入力
		String s = sc.next();
        String sa[];
        sa = new String[s.length()];
        int countA = 0;
        int countB = 0;
        int countY = 0;
        for(int i=0; i<s.length(); i++){
            if(i < s.length() -1){
            sa[i] = s.substring(i, i+1);
            }
            else{
            sa[i] = s.substring(i);
            }
            switch (sa[i]){
                case "a":
                    countA = countA + 1;
                    if(countY < a + b){
                        countY = countY + 1;
                        		System.out.println("Yes" + "\n");
                    }
                    else{
                                System.out.println("No" + "\n");
                    }
                    break;
                case "b":
                    countB = countB + 1;
                    
                    if(countY < a + b && countB <= b){
                        countY = countY + 1;
                                System.out.println("Yes" + "\n");
                    }
                    else{
                                System.out.println("No" + "\n");
                    }
                    break;
                case "c":
                                System.out.println("No" + "\n");
                    break;
            }
        }
		// 出力
	}
}