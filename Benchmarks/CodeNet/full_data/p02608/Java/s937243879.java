import java.util.*;

public class Main{
	public static void main(String[] args){
      	Scanner sc = new Scanner(System.in);
    	int n = Integer.parseInt(sc.next());
      	int count = 0;
      	int i = 1,j = 1,k = 1;
      	ArrayList<Integer> list = new ArrayList<>();
        for(i = 1;i * j * k < n;i++){
          for(j = 1;i * j * k < n;j++){
            for(k = 1;i * j * k < n;k++){
              list.add(i * j * k);
            }
          }
        }
      	for(int cnt = 0;cnt < n;cnt++){
        	System.out.println(Collections.frequency(list,cnt));
        }
    }
}
