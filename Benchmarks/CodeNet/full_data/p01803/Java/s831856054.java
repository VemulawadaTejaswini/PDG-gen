

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			int n = Integer.parseInt(br.readLine());

			if(n == 0){
				break;
			}

			String[] input = new String[n];

			for(int i = 0; i < n; i++){
				input[i] = br.readLine();
			}

			String names[] = new String[n];
			for(int i = 0; i < n; i++){
				//前半　最初の母音抽出　後半　母音除去
//				names[i] = names[i].replaceAll("[^aeiou].*", "") + names[i].replaceAll("[aeiou]", "");
//				//あとで処理をしやすいように余計な文字をたくさん追加しておく
//				names[i] += "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";

				names[i] = ""+input[i].charAt(0);
				for(int j = 0; j < input[i].length() - 1; j++){
					if(input[i].substring(j, j + 1).matches("[aeiou]")){
						names[i] += input[i].charAt(j + 1);
					}
				}
				//あとで処理をしやすいように余計な文字をたくさん追加しておく
				names[i] += "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";

//				System.out.println(names[i]);
			}

			//比較は素朴にやる

			for(int i = 1; i <= 50; i++){
				boolean same = false;
				for(int j = 0; j < n; j++){
					for(int k = j + 1; k < n; k++){
//						int len1 = Math.min(i, names[j].length());
//						int len2 = Math.min(i, names[k].length());
//						//どちらか一方の文字列がより短ければ異なるということ
//						if(len1 != len2){
//							continue;
//						}

						if(names[j].substring(0, i).equals(names[k].substring(0, i))){
							same = true;
							break;
						}
					}

					if(same){
						break;
					}
				}

				if(!same){
					System.out.println(i);
					break;
				}
				else if(i == 50){
					System.out.println(-1);
				}
			}


		}
	}

}

