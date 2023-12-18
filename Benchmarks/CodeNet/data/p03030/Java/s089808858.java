import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Main m = new Main(sc);
        m.show(m.solve());
        sc.close();
    }
    
	//フィールド
    Scanner sc;
    int N;
    String[] S;
    int[] P;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        N = sc.nextInt();
        S = new String[N];
        P = new int[N];
        for (int i=0; i<N; i++) {
        	S[i] = sc.next();
        	P[i] = sc.nextInt();
        }
    }
    
    //解答処理
    private List<Restaurant> solve() {
    	List<Restaurant> restaurant = new ArrayList<Restaurant>();
        
    	for (int i=0; i<N; i++) {
    		Restaurant res = new Restaurant();
    		res.setCity(S[i]); 
    		res.setPoint(P[i]);
    		res.setI(i+1);
    		restaurant.add(res);
    	}
    	
    	Collections.sort(restaurant);
        return restaurant;
    }
    
    //出力
    public void show(List<Restaurant> answer) {
        for (Restaurant restaulant : answer) {
			System.out.println(restaulant.getI());
		}
    }

}


class Restaurant implements Comparable<Restaurant>{
	private String city;
	private int point;
	private int i;
	
	//public String getCity() {
	//	return city;
	//}
	public void setCity(String city) {
		this.city = city;
	}
	//public int getPoint() {
	//	return point;
	//}
	public void setPoint(int point) {
		this.point = point;
	}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}

	//点数を比較するメソッド
	public int compareTo(Restaurant other) {
	    int ans = city.compareTo(other.city);
	    if (ans != 0) return ans;
	    return Integer.compare(other.point, point);
	  }
}
