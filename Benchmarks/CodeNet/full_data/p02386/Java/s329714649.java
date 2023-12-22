import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static final int BIG_NUM  = 2000000000;
	public static final int MOD  = 1000000007;

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {

			int N = Integer.parseInt(br.readLine());
			Dice dice[] = new Dice[N];
			for(int i = 0; i < dice.length; i++)dice[i] = new Dice();

			int array[] = new int[6];

			for(int i = 0; i < N; i++){
				String str[] = br.readLine().split("\\s+");

				for(int k = 0; k < str.length; k++){
					array[k] = Integer.parseInt(str[k]);
				}

				dice[i].setNumber(array[0], array[1], array[2], array[3], array[4], array[5]);
			}

			boolean FLG = true;

			for(int i = 0; i < N-1; i++){
				for(int k = i+1; k < N; k++){
					if(dice[i].equals(dice[k])){
						FLG = false;
						break;
					}
				}
				if(!FLG)break;
			}

			if(FLG){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

class Dice{

	private int number[];
	private int work[];
	private final String order = "NNNNWNNNWNNNENNNENNNWNNN";

	Dice(){
		number = new int[6];
		work = new int[6];
	}


	public void roll(char dst){
		for(int i = 0; i < 6; i++) work[i] = number[i];
		switch(dst){
		case 'E':
			setNumber(work[3],work[1],work[0],work[5],work[4],work[2]);
			break;
		case 'N':
			setNumber(work[1],work[5],work[2],work[3],work[0],work[4]);
			break;
		case 'S':
			setNumber(work[4],work[0],work[2],work[3],work[5],work[1]);
			break;
		case 'W':
			setNumber(work[2],work[1],work[5],work[0],work[4],work[3]);
			break;
		}
	};

	public int getTop(){
		return number[0];
	}

	public void setNumber(int n0,int n1,int n2,int n3,int n4,int n5){
		number[0] = n0;
		number[1] = n1;
		number[2] = n2;
		number[3] = n3;
		number[4] = n4;
		number[5] = n5;
	}

	public boolean equals(Object object){

		if(object == this)return true;
		if(object == null)return false;
		if(!(object instanceof Dice))return false;

		Dice another = (Dice)object;

		boolean FLG;

		for(int i = 0; i < order.length(); i++){
			roll(order.charAt(i));
			FLG = true;
			for(int k = 0; k < 6; k++){
				if(this.number[k] != another.number[k]){
					FLG = false;
					break;
				}
			}
			if(FLG)return true;
		}

		return false;
	}
};

