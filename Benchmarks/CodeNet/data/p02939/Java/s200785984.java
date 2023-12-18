import java*util*;
public class Main(){
	public static void main(String[] args){
    	Scanner input = new Scanner(System.in);
      	String s = input.nextLine();
      	int cnt = 0;
      	char prev = s.charAt(0);
      	int ans = 0;
      	for(int i = 0 ;i < s.length() ; i++){
        	if(prev == s.charAt(i))
              	cnt++;
          	else{
            	ans += 2*(cnt/3);
              	if(cnt%3 != 0)
                  	ans++;
              	cnt = 1;
              	prev = s.charAt(i);
            }
        } 
      	ans += 2*(cnt/3);
        if(cnt%3 != 0)
            ans++;
      	System.out.println(ans);	
    }
}
