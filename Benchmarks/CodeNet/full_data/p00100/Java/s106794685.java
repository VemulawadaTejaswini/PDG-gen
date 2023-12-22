import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str,strArray[];
		ArrayList<Shachiku> list = new ArrayList<Shachiku>();

		while(!(str=br.readLine()).equals("0")){
			int n = Integer.parseInt(str);
			boolean toBe = false;

			for(int i=0; i<n; i++){
				strArray = br.readLine().split(" ");
				int id = Integer.parseInt(strArray[0]);
				long value = Long.parseLong(strArray[1]);
				long much = Long.parseLong(strArray[2]);
				long result = value*much;


				if(list.isEmpty()){
					list.add(new Shachiku(id, result));
				}else{
					boolean judge=false;
					for(int j=0; j<list.size(); j++){
						if(list.get(j).getID() == id){
							judge=true;
							list.get(j).Cal(result);
						}
					}
					if(!judge){
						list.add(new Shachiku(id, result));
					}
				}

			}

			for(int i=0; i<list.size(); i++){
				if(list.get(i).getResult() >= 1000000){
					System.out.println(list.get(i).getID());
					toBe = true;
				}
			}

			if(!toBe){
				System.out.println("NA");
			}

			list.clear();
		}
	}
}

class Shachiku{
	private int ID;
	private long re;

	Shachiku(int id, long Re) {
		this.ID = id;
		this.re = Re;
	}

	public void Cal(long s){
		this.re += s;
	}

	public long getResult(){
		return re;
	}

	public int getID(){
		return ID;
	}

	public void judge(){
		if(this.re >= 1000000){
			System.out.println(this.ID);
		}
	}
}