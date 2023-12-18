import java.io.*;
class Contest085_A {

	public static void main(String[] args) throws IOException{
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("日付を入力して下さい。");
		int day = 0;
		int trueDay = 0;
		int falseDay = 0;
		day = Integer.parseInt(bReader.readLine());
		if(0 < day && day < 31) {
			trueDay = day; 
		}else {
			falseDay = day;
		}
		String S = "2018/01/" + trueDay;
		System.out.println(S);
		
	}

}