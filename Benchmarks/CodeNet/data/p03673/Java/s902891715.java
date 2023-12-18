import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//String tmp = sc.next();
		//int tmp = sc.nextInt();
		//Long tmp = sc.nextLong();
      int len = sc.nextInt();
      ArrayList<Integer> list = new ArrayList<Integer>();
      for(int i = 0; i < len; i++){
        list.add(sc.nextInt());
        Collections.sort(list,new Comparator<Integer>(){
          public int compare(Integer a, Integer b){
            return -1;
          }
        });
      }
      String output = "";
      for(int i = 0; i < len; i++){
        if(i == 0){
          output = list.get(i).toString();
        }else{
          output += " " +list.get(i).toString();
        }
      }
      System.out.println(output);
	}
}
