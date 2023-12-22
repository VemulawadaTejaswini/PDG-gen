

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	static BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));
	static int[][] intTmp;
	static String[][]  strTmp;

	//手札を補充し、答えを出力する役割を担うメソッド。
	public static void main(String[] args){

		int intDate = dateNum();
		intTmp = new int[intDate][9];
		strTmp = new String[intDate][9];
		yourHand(intDate);


		LummyObjR insLummy = new LummyObjR(intTmp,strTmp,intDate);
		insLummy.lummyMain();
	}

	//データセット数を読み取るメソッド。
	public static int dateNum(){

		int intLine = 0;
		try{

			String strLine = insBR.readLine();
			intLine = Integer.parseInt(strLine);

		}catch(IOException e){
		 	e.printStackTrace();
		}catch(NumberFormatException e){
			e.printStackTrace();
		}
		return intLine;

	}

	public static void yourHand(int intDateSet){

		//カードを読み取り、配列に格納。
		for(int suffix = 0; suffix < intDateSet; suffix++){
			try{
				String[] strNum = insBR.readLine().split(" ");
				for(int suffix2 = 0; suffix2 < strNum.length; suffix2++){
					intTmp[suffix][suffix2] = Integer.parseInt(strNum[suffix2]);
				}
				strTmp[suffix] = insBR.readLine().split(" ");
			}catch(IOException e){
			 	e.printStackTrace();
			}catch(NumberFormatException e){
				e.printStackTrace();
			}
		}

	}
}

class LummyObjR{

	static int intOK = 0;
	private int[][] intNum;
	private String[][] strMark;
	private List<Integer> lummyRed;
	private List<Integer> lummyBlue;
	private List<Integer> lummyGreen;
	static List<String> ngNumList;
	private int intDateSet;

	LummyObjR(){
		ngNumList = new ArrayList<String>();
	}

	LummyObjR(int[][] intNum, String[][] strMark, int intDate){
		ngNumList = new ArrayList<String>();
		setIntNum(intNum);
		setStrMark(strMark);
		this.intDateSet = intDate;
	}

	public void lummyMain(){

		//手札をメソッドで生成。

		List<Integer> answerList = new ArrayList<Integer>();;

		//プレイヤーの分のforループ。
		for(int intPlayer = 0; intPlayer < intDateSet; intPlayer++){

			int intListSize = 0;
			this.lummyRed = new ArrayList<Integer>();
			this.lummyBlue = new ArrayList<Integer>();
			this.lummyGreen = new ArrayList<Integer>();

			setSort(intPlayer);

			for(int intHand = 0; intHand < 9; intHand++){
				if("R".equals(strMark[intPlayer][intHand])){
					lummyRed.add(intNum[intPlayer][intHand]);
				}else if("B".equals(strMark[intPlayer][intHand])){
					lummyBlue.add(intNum[intPlayer][intHand]);
				}else{
					lummyGreen.add(intNum[intPlayer][intHand]);
				}
			}

			setRed(lummyRed);
			setBlue(lummyBlue);
			setGreen(lummyGreen);

			intListSize += listIssue(lummyRed);
			intListSize += listIssue(lummyBlue);
			intListSize += listIssue(lummyGreen);

			int intAnswer = -1;

			if(0 < intListSize){
				intAnswer = 0;
			}else{
				intAnswer = 1;
			}

			answerList.add(intAnswer);

		}

		//出力。
		lummyPirnt(answerList);

	}

	public int listIssue(List<Integer> lummyList){
		for(int first = 0; first < lummyList.size() - 2;first++){
			for(int second = first + 1; second < lummyList.size() - 1; second++){
				for(int third = second + 1; third < lummyList.size(); third++){
					if(lummyList.get(first) == lummyList.get(second) && lummyList.get(first) == lummyList.get(third)){
						lummyList.remove(third);
						lummyList.remove(second);
						lummyList.remove(first);
						second = first;
						third = second + 1;
					}else if(lummyList.get(first) == lummyList.get(second) - 1 && lummyList.get(first) == lummyList.get(third) - 2){
						lummyList.remove(third);
						lummyList.remove(second);
						lummyList.remove(first);
						second = first;
						third = second + 1;

					}
				}
			}
		}

		return lummyList.size();
	}

	public void setIntNum(int[][] intNum){
		this.intNum = intNum;
	}

	public void setStrMark(String[][] strMark){
		this.strMark = strMark;
	}

	public void setRed(List<Integer> lummyRed){
		this.lummyRed = lummyRed;
	}

	public void setBlue(List<Integer> lummyBlue){
		this.lummyBlue = lummyBlue;
	}

	public void setGreen(List<Integer> lummyGreen){
		this.lummyGreen = lummyGreen;
	}

	public int[][] getIntNum(){
		return intNum;
	}

	public String[][] getStrMark(){
		return strMark;
	}

	//手札の並び替え。
	public void setSort(int intPlayer){

		for(int i = 0; i < 8;i++){
			for(int j = 8; i < j;j--){
				if(this.intNum[intPlayer][j] < this.intNum[intPlayer][i]){
					int intAct = intNum[intPlayer][i];
					this.intNum[intPlayer][i] = intNum[intPlayer][j];
					this.intNum[intPlayer][j] = intAct;
					String strAct = strMark[intPlayer][i];
					this.strMark[intPlayer][i] = strMark[intPlayer][j];
					this.strMark[intPlayer][j] = strAct;
				}
			}
		}

	}

	//勝敗を判定するメソッド。
	public int lummyIssue(int intPlayer){

		//セット判定変数。
		intOK = 0;

		//基準とするカードのforループ。
		for(int intHasCard = 0; intHasCard < 7; intHasCard++){

			intOK += lummyLoop(intHasCard, intPlayer);

		}

		//答えの変数。
		int intAnswer = - 1;

		//セットが3つあるか確認。
		if(intOK == 3){
			intAnswer = 1;
		}else{
			intAnswer = 0;
		}

		ngNumList.clear();

		return intAnswer;

	}

	//1枚目のカードを基準とし、判定を繰り返すメソッド。
	public int lummyLoop(int intHasCard, int intPlayer){

		intOK = 0;

		boolean blFirstLoop = lummyNGNum(intHasCard);

		if(blFirstLoop){

			lummyNextCard(intHasCard, intPlayer);

		}

		return intOK;

	}

	//配列の添え字の数値の格納場所をまだ見ていないかを判定するメソッド。
	public boolean lummyNGNum(int intHasCard){

		boolean blNotNG = true;

		for(String strNG: ngNumList){
			if(("" + intHasCard).equals(strNG)){
				blNotNG = false;
				break;
			}
		}
		return blNotNG;
	}

	//2枚目のカードを判定するメソッド。
	public void lummyNextCard(int intHasCard, int intPlayer){

		//次の基準とするカードのforループ。
		for(int intNextCard = intHasCard + 1; intNextCard < 8; intNextCard++){

			boolean blSecondLoop = lummyNGNum(intNextCard);

			if(blSecondLoop){

				lummyAfterNext(intHasCard, intNextCard, intPlayer);

			}

		}

	}

	//3枚目のカードを判定するメソッド。
	public void lummyAfterNext(int intHasCard, int intNextCard, int intPlayer){

		//次の次のカードのforループ。
		for(int intAfterTheNext = intNextCard + 1; intAfterTheNext < 9; intAfterTheNext++){

			boolean blThirdLoop = lummyNGNum(intAfterTheNext);

			if(blThirdLoop){

				String strHasCard =this.intNum[intPlayer][intHasCard] + this.strMark[intPlayer][intHasCard];
				String strNextCard = this.intNum[intPlayer][intNextCard] + this.strMark[intPlayer][intNextCard];
				String strAfterTheNext = this.intNum[intPlayer][intAfterTheNext] + this.strMark[intPlayer][intAfterTheNext];

				String strFirstMark = this.strMark[intPlayer][intHasCard];
				String strSecondMark = this.strMark[intPlayer][intNextCard];
				String strThirdMark = this.strMark[intPlayer][intAfterTheNext];

				int intFirstNum = this.intNum[intPlayer][intHasCard];
				int intSecondNum = this.intNum[intPlayer][intNextCard];
				int intThirdNum = this.intNum[intPlayer][intAfterTheNext];

				//同じカードのセットの場合。
				if(strHasCard.equals(strNextCard) && strHasCard.equals(strAfterTheNext) && strNextCard.equals(strAfterTheNext)){

					intOK++;
					ngNumList = lummyNGAdd(intNextCard, intAfterTheNext);
					break;

				//マークが同じで、連番の場合。
				}else if(strFirstMark.equals(strSecondMark) && strFirstMark.equals(strThirdMark) &&
					strSecondMark.equals(strThirdMark)){

					List<Integer> serialNumList = new ArrayList<Integer>();

					//最小値、中間の値、最大値を算出するメソッドへ。
					serialNumList = lummySerialNum(intFirstNum, intSecondNum, intThirdNum);

					int intLow = serialNumList.get(0);
					int intMiddle = serialNumList.get(1);
					int intHigh = serialNumList.get(2);

					if(intLow == intMiddle - 1 && intLow == intHigh - 2 && intMiddle == intHigh - 1){
						intOK++;
						ngNumList = lummyNGAdd(intNextCard, intAfterTheNext);

						break;
					}
				}
			}

		}
	}

	//一度見た配列の添え字の数値をリストに格納するメソッド。
	public List<String> lummyNGAdd(int intNextCard, int intAfterTheNext){

		ngNumList.add("" + intNextCard);
		ngNumList.add("" + intAfterTheNext);

		return ngNumList;

	}

	//連番判定メソッド。
	public List<Integer> lummySerialNum(int intFirstNum, int intSecondNum, int intThirdNum){

		List<Integer> list = new ArrayList<Integer>();

		int intLow = 0;
		int intHigh = 0;
		int intMiddle = 0;

		//最小値。
		if(intFirstNum < intSecondNum && intFirstNum < intThirdNum){
			intLow = intFirstNum;
		}else if(intSecondNum < intFirstNum && intSecondNum < intThirdNum){
			intLow = intSecondNum;
		}else if(intThirdNum < intFirstNum && intThirdNum < intSecondNum){
			intLow = intThirdNum;
		}

		//最大値。
		if(intFirstNum < intThirdNum && intSecondNum < intThirdNum){
			intHigh = intThirdNum;
		}else if(intFirstNum < intSecondNum && intThirdNum < intSecondNum){
			intHigh = intSecondNum;
		}else if(intSecondNum < intFirstNum && intThirdNum < intFirstNum){
			intHigh = intFirstNum;
		}

		//中間の値。
		if(intSecondNum != intLow && intSecondNum != intHigh){
			intMiddle = intSecondNum;
		}else if(intThirdNum != intLow && intThirdNum != intHigh){
			intMiddle = intThirdNum;
		}else if(intFirstNum != intLow && intFirstNum != intHigh){
			intMiddle = intFirstNum;
		}


		//最小値、中間の値、最大値からリストに格納。
		list.add(intLow);
		list.add(intMiddle);
		list.add(intHigh);

		return list;

	}

	//最終的な出力メソッド。
	public void lummyPirnt(List<Integer> list){

		for(Integer answer: list){
			System.out.println(answer);
		}

	}
}

