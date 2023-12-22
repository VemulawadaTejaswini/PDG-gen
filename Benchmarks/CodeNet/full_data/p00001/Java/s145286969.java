import java.io.IOException;

public class Main{
    public static void main(String[] a) throws IOException {

		java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		int change;
		int[] Hill = new int[]{0,0,0,0};

		for(int i = 0;i < 10;i++){
			Hill[3] = Integer.parseInt(in.readLine());

			for(int j=2;j >= 0;j--){
				if(Hill[j+1] > Hill[j]){
					change = Hill[j+1];
					Hill[j+1] = Hill[j];
					Hill[j] = change;
				}else{
					break;
				}
			}
		}
		System.out.println("");
		for(int i=0;i < 3;i++){
			System.out.println(Hill[i]);
		}
    }
}