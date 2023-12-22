import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str,strArray[];
		boolean cups[] = new boolean[3];
		char cupAl[] = {'A', 'B', 'C'};

		cups[0] = true;

		while(null != (str=br.readLine())){
			strArray = str.split(",");
			int l,r;

			if(strArray[0].equals("A")){
				r=0;
			}else if(strArray[0].equals("B")){
				r=1;
			}else{
				r=2;
			}

			if(strArray[1].equals("A")){
				l=0;
			}else if(strArray[1].equals("B")){
				l=1;
			}else{
				l=2;
			}
		}

		for(int i=0; i<cups.length; i++){
			if(cups[i]){
				System.out.println(cupAl[i]);
				break;
			}
		}
	}

	static void Chenge(int r, int l, boolean cups[]){
		boolean temp=cups[r];
		cups[r]=cups[l];
		cups[l]=temp;
	}

}