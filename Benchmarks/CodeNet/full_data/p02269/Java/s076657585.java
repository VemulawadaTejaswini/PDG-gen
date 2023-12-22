import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int ope_num = Integer.parseInt(br.readLine());
			Dictionary(ope_num,br);
		} catch (NumberFormatException | IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
	
	//enum宣言
	public static enum Operate{
		insert("insert"),
		find ("find"),;
		
		private final String name;
		
		Operate(String name){
			this.name = name;
		}
		
		String getName(){
			return this.name;
		}

		public static Operate getEnumName(String str){
			for(Operate v : values()){
				if(v.getName().equals(str)){
					return v;
				}
			}
			throw new IllegalArgumentException("undefined : " + str);
		}
	}

	public static void Dictionary( int ope_num ,BufferedReader br ){
		ArrayDeque<String> que = new ArrayDeque<String>();
		int i;
		String[] op;
		boolean bfind;
		
		for ( i = 0; i < ope_num; i++) {
			try {
				op = br.readLine().split(" ");		//キーと命令を分割
			 
				switch( Operate.getEnumName(op[0]) ){ //命令によって処理
				case insert:
					que.add(op[1]);			//キューに追加
					break;
				case find:
					bfind = que.contains(op[1]);				//キューから削除
					
					if(bfind) {
						System.out.println("yes");
						bfind = false;
					}else {
						System.out.println("no");
					}
				}
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		}
	}
}
