import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			int week = Integer.parseInt(br.readLine());
			System.out.println(calcAfterDebt(100000, week));
		}
		catch(Exception e){
			return;
		}
		finally{
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				return;
			}
		}
	}
	
	private static int calcAfterDebt(int base,int week)
	{
		int result = base;
		for(int i=0;i<week;i++){
			result = (int) (result*1.05);
			if(result % 1000 > 0){
				result = cutThousand(result) + 1000;
			}
		}
		return result;
	}

	private static int cutThousand(int money){
		String str = Integer.toString(money);
		String str2 = str.substring(0, str.length() - 3);
		while(str2.length() < str.length()){
			str2 += "0";
		}
		
		return Integer.parseInt(str2);
	}
}