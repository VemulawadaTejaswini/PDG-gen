import java.util.*;
 
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        int countx = 0;
        int x = 0;
        while(sc.hasNext()){
            x++;
            int a = sc.nextInt();
        	list.add(a);
            if(a % 4 == 0){
            	countx++;
                x--;
                list.remove(x);
            }
        }
        for(int i = 0; i < list.size() - 1; i++){
        	for(int j = i + 1; j < list.size(); j++){
            	if((list.get(i) * list.get(j)) % 4 == 0){
                	countx++;
                }
            }
        }
        if(n / 2 <= countx){
        	System.out.println("Yes");
        }else{
        	System.out.println("No");
        }
	}
}