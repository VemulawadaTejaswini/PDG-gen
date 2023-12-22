import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = 0;
		int tmp = br.read();
		while(tmp != 13 && tmp != 10){
			n = n * 10 + (tmp - '0');
			tmp = br.read();
		}

		int[] array = new int[n];
		int num = 0;
		int i1 = 0;
		tmp = br.read();
		if(tmp == 13 || tmp == 10){
			tmp = br.read();
		}
		while(tmp != -1 && tmp != 10 && tmp != 13){
			num = 0;
			while(tmp >= '0' && tmp <= '9'){
				num = num * 10 + (tmp - '0');
				tmp = br.read();
			}
			if(tmp == -1){
				break;
			}
			array[i1] = num;
			i1++;
			tmp = br.read();
		}
		
		int index = partition(array, 0, array.length - 1);
		StringBuilder sb = new StringBuilder();
		int outLen = array.length;
		
		if(index != 0){
			sb.append(array[0]);
		}
		else{
			sb.append("["+array[0] + "]");
		}
		for(int i = 1; i < outLen ; i++){
			//sb.append(" "+array[i]);
			if(i == index){
				sb.append(" ["+array[i] + "]");
				
			}
			else{
				sb.append(" "+array[i]);
				
			}
		}
		System.out.println(sb);
	}
	
	static int partition(int[] array, int p, int r){
		int x = array[r];
		int i = p - 1;
		for(int j = p ; j <= r -1 ;j++){
			if(array[j] <= x){
				i++;
				int tmp = array[i];
				array[i] = array[j];
				array[j] = tmp;
				
			}
		}
		int tmp = array[i + 1];
		array[i + 1] = array[r];
		array[r] = tmp;
		return i + 1;
	}

}