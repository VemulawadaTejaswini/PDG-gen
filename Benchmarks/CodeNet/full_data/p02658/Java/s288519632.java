
import java.util.*;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String[] LVstr = new String[N];
		Long ans = (long) 1;
		Long limit = (long) Math.pow(10,18);
      
      	for(int i=0; i<N; i++){
			LVstr[i] = sc.next();
          	if(LVstr[i].equals("0")){
             	System.out.println("0");
				return;
            }
		}

		for(int i=0; i<N; i++){
          	if(LVstr[i].length()>19){
             	System.out.println("-1");
				return;
            }
			try{
				Long tmp = Long.valueOf(LVstr[i]);
				ans *= tmp;
				if(ans>limit){
					System.out.println("-1");
					return;
				}
			}catch(Exception e){
				ans = (long) -1;
			}finally{
				if(ans==-1){
					System.out.println("-1");
					return;
				}
			}
		}
		System.out.println(ans);
		return;
	}
}