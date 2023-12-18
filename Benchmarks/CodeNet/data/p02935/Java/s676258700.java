import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    ArrayList<Float> v = new ArrayList<Float>();
    for(int i = 0; i < n; i++) {
    	float hoge = sc.nextFloat();
    	v.add(hoge);
    }
    
    for(int i = 0; i < n-1; i++) {
    	int minIndex1 = v.indexOf(Collections.min(v));
    	float mixV1 = v.get(minIndex1);
    	v.remove(minIndex1);
    	
    	int minIndex2 = v.indexOf(Collections.min(v));
    	float minV2 = v.get(minIndex2);
    	v.remove(minIndex2);
    	
    	
    	float value = (mixV1 + minV2) / 2;
    	
    	v.add(value);
    }
    
    System.out.println(v.get(0));
    sc.close();
    
  }
}