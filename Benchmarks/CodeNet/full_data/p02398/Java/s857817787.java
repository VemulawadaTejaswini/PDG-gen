import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr = br.readLine().split(" ");
        int a,b,c;
    	int count = 0;

    	a = Integer.parseInt(strArr[0]);
    	b = Integer.parseInt(strArr[1]);
    	c = Integer.parseInt(strArr[2]);

		for(int i = a; i < b; i++){
			if(c % i == 0){
				count++;
			}
		}

		System.out.println(count);

    }
}