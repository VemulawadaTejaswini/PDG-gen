import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
      	List<String> arr = new ArrayList<String>();
      	List<String> arr2 = new ArrayList<String>();
        String x = "";
      	String x1 = "";
        String x2 = "";
        String x3 = "";
        String x4 = "";
        for(int i = 0; i < str.length(); i++) {
            x = String.valueOf(str.charAt(i));
            arr2.add(x);
          	if(arr.contains(x) == false){
              arr.add(x);
            }
        }
        if(arr.size() > 2){
	      System.out.println("No");
          return;
        }
        x1 = arr2.get(0);
        x2 = arr2.get(1);
        x3 = arr2.get(2);
        x4 = arr2.get(3);
      	if(x1.equals(x2)){
          if(x2.equals(x3)){
            System.out.println("No");
            return;
          }
        }else{
          if(!x2.equals(x3)){
            System.out.println("No");
            return;
          }
        }
		System.out.println("Yes");
    }
}