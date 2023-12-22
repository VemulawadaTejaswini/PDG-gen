import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
      	int x = sc.nextInt();
      	int n = sc.nextInt();
      	for(int cnt = 0;cnt < n;cnt++){
        	list.add(sc.nextInt());
        }
      	int min = --x;
      	int max = ++x;
      	if(n == 0){
        	System.out.println(x);
        }else{
          while(true){
              if(list.indexOf(min) == -1){
                  System.out.println(min);
                  break;
              }else if(list.indexOf(max) == -1){
                  System.out.println(max);
                  break;
              }
              min--;
              max++;
          }
        }
	}
}