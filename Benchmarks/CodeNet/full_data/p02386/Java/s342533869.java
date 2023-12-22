import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int[] dice1 = new int[6];
		int[] dice2 = new int[6];
		int[][] dice = new int[num][6];					//num???????????????????????????
		String result = "";

		for(int i = 0; i < num; i++){
			String[] str = br.readLine().split(" ");
			for(int j = 0; j < 6; j++){
				dice[i][j] = Integer.parseInt(str[j]);	//??????????????????????????\
			}
		}
		for(int i = 0; i < num; i++){
			for(int j = (i + 1); j < num; j++){
				for(int k = 0; k < 6; k++){
					dice1[k] = dice[i][k];
					dice2[k] = dice[j][k];
				}
				Dice2 di = new Dice2(dice1,dice2);//???????????????i????????¨???i+1??????????????????
				if(di.compare_dice()){
					result = "No";
					break;
				}else{
					result = "Yes";
				}
			}
			if(result == "No"){
				break;
			}
		}
		System.out.println(result);

	}
}
class Dice2{
    int[] dice1 = new int[6];
    int[] dice2 = new int[6];
    StringBuilder sb1 = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    String str1,str2;

    public Dice2(int[] dice1, int[] dice2){
        for(int i=0; i<6; i++){
            this.dice1[i] = dice1[i];
            this.dice2[i] = dice2[i];

        }
        sb1.append(dice1[1]);
        sb1.append(dice1[2]);
        sb1.append(dice1[4]);
        sb1.append(dice1[3]);
        str1 = sb1.toString();
    }
    public boolean compare_dice(){							//if???????????¶?????????????????´??????????????\??????
        if(dice2[0] == dice1[0] && dice2[5] == dice1[5]){	//????????????i+1??????????????¢??¨????????????i??????????????¢???????????¨??????????????¢??????????????¨???
                sb2.append(dice2[1]);
                sb2.append(dice2[2]);
                sb2.append(dice2[4]);
                sb2.append(dice2[3]);
                str2 = sb2.toString();
                return (str1+str1).contains(str2);
        }
        else if(dice2[1] == dice1[0] && dice2[4] == dice1[5]){
                sb2.append(dice2[0]);
                sb2.append(dice2[3]);
                sb2.append(dice2[5]);
                sb2.append(dice2[2]);
                str2 = sb2.toString();
                return (str1+str1).contains(str2);
        }
        else if(dice2[2] == dice1[0] && dice2[3] == dice1[5]){
                sb2.append(dice2[0]);
                sb2.append(dice2[1]);
                sb2.append(dice2[5]);
                sb2.append(dice2[4]);
                str2 = sb2.toString();
                return (str1+str1).contains(str2);
        }
        else if(dice2[3] == dice1[0] && dice2[2] == dice1[5]){
                sb2.append(dice2[0]);
                sb2.append(dice2[4]);
                sb2.append(dice2[5]);
                sb2.append(dice2[1]);
                str2 = sb2.toString();
                return (str1+str1).contains(str2);
        }
        else if(dice2[4] == dice1[0] && dice2[1] == dice1[5]){
                sb2.append(dice2[0]);
                sb2.append(dice2[2]);
                sb2.append(dice2[5]);
                sb2.append(dice2[3]);
                str2 = sb2.toString();
                return (str1+str1).contains(str2);
        }
        else if(dice2[5] == dice1[0] && dice2[0] == dice1[5]){
                sb2.append(dice2[1]);
                sb2.append(dice2[3]);
                sb2.append(dice2[4]);
                sb2.append(dice2[2]);
                str2 = sb2.toString();
                return (str1+str1).contains(str2);
        }else{
            return false;
        }
    }
}