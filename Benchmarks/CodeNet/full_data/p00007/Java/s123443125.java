public class DebtHell {
	public static void main(String[] args) {
		int result = 100000;
		
		if (!"0".equals(args[0])) {
			int n = Integer.parseInt(args[0]);
			for(int i = 0; i < n;i++){
				result =(int)(result + (result * 0.05));
				if((result % 1000) != 0 ){
					result = ((int)(result / 1000) + 1) * 1000;
				}
			}
		}
		System.out.println(result);
	}
}