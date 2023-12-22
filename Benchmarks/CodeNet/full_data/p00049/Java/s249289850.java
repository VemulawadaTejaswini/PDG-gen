
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<Integer, BloodType> map = new TreeMap<Integer, BloodType>();
		
		String input;
		while((input = br.readLine()) != null){
			String[] str = input.split(",");
			map.put(Integer.parseInt(str[0]), parseBlood(str[1]));
		}
		int[] numPersonBloodType = getNumPersonBloodType(map);
		for(int n : numPersonBloodType){
			System.out.println(n);
		}
	}

	private static BloodType parseBlood(String str){
		if(str.equals("A"))			return BloodType.A;
		else if(str.equals("AB")) 	return BloodType.AB;
		else if(str.equals("B"))	return BloodType.B;
		else if(str.equals("O"))	return BloodType.O;
		else						return null;
	}

	private static int[] getNumPersonBloodType(Map map){
		int[] numPersonBloodType = new int[4];
		for(int i = 0; i < numPersonBloodType.length; i++){
			numPersonBloodType[i] = 0;
		}
		
		Set keySet = map.keySet();
		Iterator ite = keySet.iterator();
		while(ite.hasNext()){
			Integer key = (Integer)ite.next();
			BloodType bloodType = (BloodType)map.get(key);
			if(bloodType == BloodType.A)	numPersonBloodType[0]++;
			if(bloodType == BloodType.B)	numPersonBloodType[1]++;
			if(bloodType == BloodType.AB) 	numPersonBloodType[2]++;
			if(bloodType == BloodType.O)	numPersonBloodType[3]++;
		}
		return numPersonBloodType;
	}
	
	enum BloodType{
		A, B, AB, O
	}
}