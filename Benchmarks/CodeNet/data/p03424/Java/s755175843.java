import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//下記に文字取得
		int n = sc.nextInt();//ひなあられ
		String kotei[] = {"P","W","G","Y"};//配列初期化
		String s[] = new String[n];
		int count = 0;
		for(int ii = 0;ii < n;ii++){//文字列取得
			s[ii] = sc.next();	
		}
		//System.out.println(s.length);
		for(int i = 0;i < 4;i++){
			for(int ii = 0;ii < n;ii++){
				if (kotei[i].equals(s[ii])){
					count++;
					break;
				}
			}
		}
		if(count == 4){
			System.out.println("Four");
		}else if(count == 3){
			System.out.println("Three");
		}

		
	
	}
}
