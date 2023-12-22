import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Formatter;

class Main{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			while(true){
				String[] nums = br.readLine().split(" ");
				int a = Integer.parseInt(nums[0]);
				int b = Integer.parseInt(nums[1]);
				int yaku = Yukurid(a,b);
				int bai = a * (b / yaku);
				System.out.println(yaku + " " + bai);
			}
		}
		catch(Exception e){
			return;
		}
	}
	
	private static int Yukurid(int a,int b){
		if(a < b){
			int temp = b;
			b = a;
			a = temp;
		}
		//double div = (double)a / b;
		int remainder = a % b;
		
		if(remainder == 0){ return b; }
		else { return Yukurid(b,remainder); }
	}

}