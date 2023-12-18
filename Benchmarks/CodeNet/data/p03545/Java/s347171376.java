import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Main main=new Main();
		main.run();
	}

	void run() {

		Scanner sc=new Scanner(System.in);

		String input =sc.next();

		int gyoukan=input.length()-1;

		//三つの隙間に＋か－を入れて、7になる式をつくる。
		//bit列をつくって0を－、1を＋に対応させる。

		for(int bitretu=0;bitretu<(1<<gyoukan);bitretu++) {


			int sum=0;

			//今右から何桁目を指しているかを管理するための変数。
			for(int pointer=0;pointer<gyoukan;pointer++) {

				int a=input.charAt(gyoukan-pointer)-'0';

				if((bitretu>>pointer)%2==0) {
					sum-=a;
				}else {
					sum+=a;
				}

			}

			//一番左は毎回足し算する。
			sum+=(input.charAt(0)-'0');


			//1234
			//gyoukan=3;
			if(sum==7) {
				String result="";

				for(int pointer=0;pointer<gyoukan;pointer++) {

					result=input.substring(input.length()-pointer,input.length()+1-pointer)+result;

					if((bitretu>>pointer)%2==0) {
						result="-"+result;
					}else {
						result="+"+result;
					}

				}

				result=input.substring(0,1)+result+"=7";

				System.out.println(result);

			}

		}

	}






}



