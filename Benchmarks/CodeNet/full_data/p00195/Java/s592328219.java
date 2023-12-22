import java.io.*;
import java.util.*;

public class Main{
	public static void main(String args[]){
		try{
			new Main();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public final String[] SHOP = {"A", "B", "C", "D", "E"};
	
	public Main() throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		
		while(true){
			Shop[] shops = new Shop[5];
			for(int i=0; i<5; i++){
				line = in.readLine();
				String[] tmp = line.split(" ");
				int am = Integer.parseInt(tmp[0]);
				int pm = Integer.parseInt(tmp[1]);
				if(am==0 && pm==0) return;
				shops[i] = new Shop(SHOP[i], am + pm);
			}
			Arrays.sort(shops, new shop_comparator());
			
			System.out.printf(shops[4].name + " %d\n", shops[4].sales);
		}
	}
}

class shop_comparator implements Comparator<Shop>{
	public int compare(Shop s1, Shop s2){
		return s1.sales - s2.sales;
	}
}

class Shop{
	String name;
	int sales;
	
	public Shop(String name, int sales){
		this.name = name;
		this.sales = sales;
	}
}