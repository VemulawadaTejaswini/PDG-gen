import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		//ArrayList<String> dict = new ArrayList<String>();
		String[] dict = new String[1000000];
		int words = 0;
		for(int i = 0; i < n; i++){
			String[] tmpArray = br.readLine().split(" ");
			String inst = tmpArray[0];
			String str = tmpArray[1];
			
			if(inst.equals("insert")){
				//insert(dict, str);
				dict[words] = new String(str);
				words++;
			}
			else if(inst.equals("find")){
				boolean contains = false;
				
				for(int j = 0; j < words ; j++){
					if(dict[j].equals(str)){
						contains = true;
						break;
					}
				}
				if(contains){
					System.out.println("yes");
				}
				else{
					System.out.println("no");
				}
			}
		}

	}
/*
	private static void insert(String[] dict, String str) {
		// TODO ?????????????????????????????????????????????
		if(dict.size() == 0){
			dict.add(str);
		}
		else {
			//Iterator<String> it = dict.iterator();
			while(it.hasNext()){
				if(it.next() > it.)
			}
		}
	}
*/
}