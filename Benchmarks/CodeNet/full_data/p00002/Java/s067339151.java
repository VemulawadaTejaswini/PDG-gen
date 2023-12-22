import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main{

	public static void main(String[] args) throws Exception {
		// TODO ?????????????????????????????????????????????
		int[] arg =new int[100];
        int i=0;
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] tokens = line.split(" ");
                arg[i]=Integer.parseInt(tokens[0])+Integer.parseInt(tokens[1]);
                i++;
            }
        }

		int ii=0;
		for(int j=0;j<i;j++){
			int store=arg[j];
			ii=0;
			while(store>0){
				store=store/10;
				ii++;
			}
			System.out.println(ii);
		}
	}

}