import java.util.Scanner;
import java.util.regex.Pattern;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in).useDelimiter("\\r\\n");
		Pattern pattern = Pattern.compile("the|this|that");

		//暗号解読部
		while(stdIn.hasNext()){
			String[] cipherArray = stdIn.next().split(" ");

cipher:		for(int i = 0;i < 25; i++){
				//"cipher"に、"単語"の"the","this","that"があるか調べる
				for(String x:cipherArray){
					if(pattern.matcher(x).find()){
						break cipher;
					}
				}

				for(int j = 0;j < cipherArray.length;j++){
					//全ての文字を、ひとつ後ろの文字にずらす(例：a→b,z→a)
					char[] cipher = cipherArray[j].toCharArray();
					for(int k = 0;k < cipher.length; k++){
						if(97 <= cipher[k] && cipher[k] <= 121){
							cipher[k]++;
						}else if(cipher[k] == 122){
							cipher[k] = 97;
						}
					}
					cipherArray[j] = String.valueOf(cipher);
				}
			}
			for(int i = 0;i< cipherArray.length; i++){
				if(i< cipherArray.length - 1){
					System.out.print(cipherArray[i] + " ");
				}else{
					System.out.println(cipherArray[i]);
				}
			}
		}
	}
}