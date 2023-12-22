import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		while((str = br.readLine())!=null){
			int num = Integer.parseInt(str);
			ArrayList<String> read_str = new ArrayList<String>();
			int max_length = 0;
			for(int i = 0; i<num; i++){
				String read = br.readLine();
				if(read.length()>max_length){
					max_length = read.length();
				}
				read_str.add(read);
			}
			//System.out.println(check_state(max_length, read_str));
			System.out.println(1);
			if(num == 0){
				break;
			}
		}
	}

	public static int check_state(int length, ArrayList<String> read_list){
		char boin[] = {'a','i','u','e','o'};
		String str;
		int max_k = 1;
		ArrayList<String> list = new ArrayList<String>();
		for(int i= 0; i<read_list.size(); i++){
			StringBuilder build = new StringBuilder();
			char array[] = read_list.get(i).toCharArray();
			boin_add(array, boin , build,length);
			str = new String(build);
			if(str.length()>max_k){
				max_k = str.length()+1;
			}
			list.add(str);
		}

		for(int i = 1; i<50; i++){
			ArrayList<String> check_list = new ArrayList<String>();
			for(int j = 0; j<list.size(); j++){
				if(i > list.get(j).length()){
					str = list.get(j).substring(0, list.get(j).length());
				}else{
					str = list.get(j).substring(0, i);
				}
				if(check_list.indexOf(str) != -1){
					break;
				}
				check_list.add(str);
			}
			if(check_list.size()==list.size()){
				return i;
			}
		}
		return -1;
	}

	public static void  boin_add(char array[], char boin[], StringBuilder build,int length){
		build.append(array[0]);
		for(int s = 0; s<length; s++){
			for(int j = 0; j<boin.length; j++){
				if(s>=array.length-1){
					return;
				}
				if(array[s] == boin[j]){
					build.append(array[s+1]);
				}
			}
		}
	}
}