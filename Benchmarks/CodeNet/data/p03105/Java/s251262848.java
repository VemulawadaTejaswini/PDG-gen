import java.util.*;
 
public class Main {
 
	public static void main(String[] args){
		Scanner sn = new Scanner(System.in);
ArrayList<Integer> list = new ArrayList<Integer>();
 
while (sn.hasNextLine()) {
    String str = sn.nextLine();
    list.add(Integer.parseInt(str));
}
		int A=list.get(0)/list.get(1);
      System.out.println(A);

}
}