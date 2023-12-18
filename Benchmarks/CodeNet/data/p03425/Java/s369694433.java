import java.util.Scanner;


public class Main {
	
	static int[][] memory;
	
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
   
        int count = 0;
        int[] member = new int[5];
        
        for(int i = 0;i<N;i++){
        	
        	String line = sc.next();
        	
        	if('M'==line.charAt(0)){
        		member[0]++;
        		
        	}else if('A'==line.charAt(0)){
        		member[1]++;
        	}else if('R'==line.charAt(0)){
        		member[2]++;
        	}else if('C'==line.charAt(0)){
        		member[3]++;
        	}else if('H'==line.charAt(0)){
        		member[4]++;
        	}
        	
        	
        	
        }
        
        long ans = result(member,0,0);
        
        System.out.println(ans);
		
	}

	private static long result(int[] member,int count,int choise) {
		
		int ans=1;
		
		if(choise==4)
			if(count==2)	return member[choise];
			else if(count==3)	return 1;
			else return 0;
		
		if(count<3&&member[choise]>0){
			ans *= (result(member,count,choise+1)+result(member,count+1,choise+1)*member[choise]);
		}else{
			ans *= result(member,count,choise+1);
		}
		
		return ans;
		
	}
		

    
}