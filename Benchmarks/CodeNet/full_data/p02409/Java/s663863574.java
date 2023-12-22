import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int
			n,		//入力件数
			b,		//棟
			f,		//階
			r,		//部屋
			v;		//入居者
			
		int[][][]
			house	= new int[4][3][10];	//記録用配列（4棟3階10部屋分の入居者数(v)を格納）
			
		String
			output;							//出力する文字列
			
		String[]
			input	= new String[4];		//入力(b,f,r,v)を格納する
		
		
		n = Integer.parseInt(sc.nextLine());		//入力件数の入力
		
		for(int i=0;i<n;i++){
			
			//各情報の入力
			input = sc.nextLine().split("[\\s]+");
			b = Integer.parseInt(input[0]);
			f = Integer.parseInt(input[1]);
			r = Integer.parseInt(input[2]);
			v = Integer.parseInt(input[3]);
			
			//入力データを記録用配列に合わせ、入居者を加算
			house[b - 1][f - 1][r - 1] += v;
		}
		
		//表示処理
		for(b = 0;b < 4;b++){
			
			for(f = 0;f < 3;f++){
				
				output = "";
				for(r = 0;r < 10;r++){
					
					//数字の前にスペースを入れる
					output += " " + house[b][f][r];
				}
				//出力
				System.out.println(output);
				
			}
			//棟が変わる場合#を20個入れる(最後の行には入れないように)
			if(b < 3){
				System.out.println("####################");
			}
		}
	}
}

