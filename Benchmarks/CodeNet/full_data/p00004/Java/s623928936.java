import java.io.IOException;

public class Main{
    public static void main(String[] a) throws IOException {
		String Input;
		String[] Q = new String[6];
		int[] Q2 = new int[6];
		int Twice1 = 0,Twice2 = 0;
		int Change;
		int i;
		double ansX,ansY;
		java.io.BufferedReader in = new java.io.
									BufferedReader(new java.io.InputStreamReader(System.in));
		try{

			while((Input = in.readLine()) != null){	//入力が終了したら抜ける。
				Q = Input.split(" ");
				for(i = 0;i < Q.length;i++){	//String型配列Qをint型配列Q2に入れる
					Q2[i] = Integer.parseInt(Q[i]);
				}

				if(Q2[1] > Q2[3]){		//最初の値で代償を比べて小さい方を上に大きい方を下に
					for(i = 0;i<3;i++){
						Change = Q2[i];
						Q2[i] = Q2[i+3];
						Q2[i+3] = Change;
					}	
				}

				for(i = Q2[3];i < i + 1; i += Q2[3]){	//何倍かを決める
					if(i % Q2[0] == 0){
						Twice1 = i / Q2[0];
						Twice2 = i / Q2[3]; 
						break;
					}
				} 

				ansY = (double)(Q2[2]*Twice1 - Q2[5]*Twice2) / (Q2[1]*Twice1 - Q2[4]*Twice2);
				ansX = (double)(Q2[2] - Q2[1] * ansY) / Q2[0];

				System.out.printf("%.3f %.3f\n", ansX, ansY);
			}
		
		}catch(Exception e){

		}

    }
}