import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        
		int N =sc.nextInt();
		
		String s =sc.next();
		String[] split = new String[N];
		int countR=0;
	
        
        String[] spt = s.split("");
        
        for(int i=0;i<N;i++){
            if(spt[i].equals("R")){
                countR++;
            }
        }
        if((N/2)<countR){
            System.out.println("Yes");
        }
        
        
        
        
    }
}
