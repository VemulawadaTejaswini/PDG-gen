import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Hashtable;


public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		//ArrayList<String> dict = new ArrayList<String>();
		Hashtable<String, Integer> hashDict = new Hashtable<String, Integer>();
		//String[] dict = new String[1000000];
		int words = 0;
		for(int i = 0; i < n; i++){
			String[] tmpArray = br.readLine().split(" ");
			String inst = tmpArray[0];
			String str = tmpArray[1];

			if(inst.equals("insert")){
				//insert(dict, str);
				hashDict.put(str, words);
				//dict[words] = new String(str);
				words++;
			}
			else if(inst.equals("find")){
				/*
			}
				boolean contains = false;

				for(int j = 0; j < words ; j++){
					if(dict.get(i).equals(str)){
						contains = true;
						break;
					}
				}*/


				//if(dict.contains(str)){
				if(hashDict.get(str) != null){
					System.out.println("yes");
				}
				else{
					System.out.println("no");
				}
			}
		}

	}

	private static void insert(ArrayList<String> dict, String str) {
		// TODO ?????????????????????????????????????????????
		if(dict.size() == 0){
			dict.add(str);
			return;
		}
		else {
			//Iterator<String> it = dict.iterator();
			for(int i = 0; i < dict.size() - 1 ; i++){
				if(dict.get(i).compareTo(str) < 0 && (dict.get(i + 1) == null || dict.get(i+1).compareTo(str) > 0)){
					dict.add(i + 1, str);
					return;
				}
			}
		}

		dict.add(str);

	}
}