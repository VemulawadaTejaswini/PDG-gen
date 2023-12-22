import java.io.IOException;

public class Main{
    public static void main(String[] a) throws IOException {
		int set;
		int s1,s2,s3;
		String[] stock = new String[3];
		java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		String Input = in.readLine();
		set = Integer.parseInt(Input);

		for(int i = 0;i < set;i++){
			Input = in.readLine();
			stock = Input.split(" ");
			s1 = Integer.parseInt(stock[0]);
			s2 = Integer.parseInt(stock[1]);
			s3 = Integer.parseInt(stock[2]);
			if(Math.pow(s1,2) + Math.pow(s2,2) == Math.pow(s3,2)){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
    }
}