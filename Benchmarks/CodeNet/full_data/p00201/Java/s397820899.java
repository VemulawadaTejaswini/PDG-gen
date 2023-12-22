import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n != 0){
			Hashtable<String,Integer> buy = new Hashtable<String,Integer>();
			for(int i = 0 ; i < n ; i++){
				buy.put(sc.next(), sc.nextInt());
			}
			int m = sc.nextInt();
			Hashtable<String, ArrayList<String>> recipe = new Hashtable<String, ArrayList<String>>();
			for(int i = 0 ; i < m ; i++){
				String name = sc.next();
				int k = sc.nextInt();
				ArrayList<String> list = new ArrayList<String>();
				for(int j = 0 ; j < k ; j++){
					list.add(sc.next());
				}
				recipe.put(name, list);
			}
			System.out.println(minprice(sc.next(), buy, recipe));
			n = sc.nextInt();
		}
		sc.close();
	}
	static int minprice(String name, Hashtable<String, Integer> buy, Hashtable<String, ArrayList<String>> recipe){
		int price = (Integer)buy.get(name);
		if(recipe.containsKey(name)){
			int makeprice = 0;
			ArrayList<String> elements = (ArrayList<String>)recipe.get(name);
			while(!elements.isEmpty()){
				makeprice += minprice((String)elements.get(0), buy, recipe);
				elements.remove(0);
			}
			recipe.remove(name);
			if(makeprice < price){
				price = makeprice;		
			}
		}
		return price;
	}
}