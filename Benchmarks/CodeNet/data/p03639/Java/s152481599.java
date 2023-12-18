import java.util.*;
 
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        int countx = 0;
        int county = 0;
        while(sc.hasNext()){
            int a = sc.nextInt();
            if(a % 4 == 0){
            	countx++;
            }else if(a % 2 == 0){
            	county++;
                if(county == 2){
                	countx++;
                    county = 0;
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