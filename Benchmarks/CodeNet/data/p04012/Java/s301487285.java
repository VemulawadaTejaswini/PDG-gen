import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	/* 入力 */
	String w = scan.next();
	int[] eng = new int[26];

	/* 文字数カウント */
	for(int i = 0; i < w.length(); i++){
	    eng[w.charAt(i)-97]++;
	}

	/* 遇奇判定 */
	int flag = 1;
	for(int i = 0; i < 26; i++){
	    if(eng[i] % 2 != 0){
		flag = -1;
		break;
	    }
	}

	if(flag == 1){
	    System.out.println("Yes");
	}else{
	    System.out.println("No");
	}
    }
}
