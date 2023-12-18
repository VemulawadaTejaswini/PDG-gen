import java.util.Scanner;
 
public class Main{
	public static void main(String[] args){
      	Scanner sc = new Scanner(System.in);
  		int ans = 0;
      	for(int i=0;i<3;i++){
			String s = sc.next();
          	if(s.equals("1")){
				ans++;
            }
        }
        
       	System.out.println(ans);
	}
}