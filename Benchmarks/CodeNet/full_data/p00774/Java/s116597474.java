import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		int h, score, preScore;
		Scanner in = new Scanner(System.in);
		
		h = in.nextInt();
		while(h != 0){
			int[][] s = new int[h][5];
			score = 0;
			preScore = 0;
			//?????????????´????????´???????
			for(int i=0; i<h; i++){
				for(int j=0; j<5; j++){
					s[i][j] = in.nextInt();
				}
			}
			
			while(true){
				
				//3?????\???????????£????????????????????????????????¢?????????0??????
				for(int i=0; i<h; i++){
					for(int j=0; j<3; j++){
						if(j==0){
							//??????????????????5???????????????????????´???
							if(s[i][0]==s[i][1] && s[i][1]==s[i][2] && s[i][2]==s[i][3] && s[i][3]==s[i][4]){
								score += s[i][0]*5;
								s[i][0] = s[i][1] = s[i][2] = s[i][3] = s[i][4] = 0;
							//??????????????????4???????????????????????´???
							}else if(s[i][0]==s[i][1] && s[i][1]==s[i][2] && s[i][2]==s[i][3]){
								score += s[i][0]*4;
								s[i][0] = s[i][1] = s[i][2] = s[i][3] = 0;
							//??????????????????3???????????????????????´???
							}else if(s[i][0]==s[i][1] && s[i][1]==s[i][2]){
								score += s[i][0]*3;
								s[i][0] = s[i][1] = s[i][2] = 0;
							}
							
						}else if(j==1){
							//2????????????4???????????????????????´???
							if(s[i][1]==s[i][2] && s[i][2]==s[i][3] && s[i][3]==s[i][4]){
								score += s[i][1]*4;
								s[i][1] = s[i][2] = s[i][3] = s[i][4] = 0;
							//2????????????3???????????????????????´???
							}else if(s[i][1]==s[i][2] && s[i][2]==s[i][3]){
								score += s[i][1]*3;
								s[i][1] = s[i][2] = s[i][3] = 0;
							}
							
						}else if(j==2){
							//3????????????3???????????????????????´???
							if(s[i][2]==s[i][3] && s[i][3] == s[i][4]){
								score += s[i][2]*3;
								s[i][2] = s[i][3] = s[i][4] = 0;
							}
						}
					}
				}
				
				if(score == preScore){
					break;
				}else{
					preScore = score;
				}
				
				//0??????????????¨???????????°??????
				for(int i=1; i<h; i++){
					for(int j=0; j<5; j++){
						if(s[i][j]==0){
							for(int k=i; k>0; k--){
								s[k][j] = s[k-1][j];
							}
						}
					}
				}
			}
			
			System.out.println(score);
			h = in.nextInt();
		}
		
		in.close();
	}
}