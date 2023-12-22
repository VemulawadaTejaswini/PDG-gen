public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = 0, b = 0, c = 0;

		for(int i = 0 ; i < 10; i++){
			String str = br.readLine();
			int input = Integer.parseInt(str);
			if(input > a){
				c = b;
				b = a;
				a = input;
				continue;
			}
			if(input > b){
				c = b;
				b = input;
				continue;
			}
			if(input > c){
				c = input;
				continue;
			}
		}

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}