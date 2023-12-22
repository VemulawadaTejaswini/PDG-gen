import java.util.Scanner;

public class Main {
    static int top;
    static int north;
    static int east;
    static int south;
    static int west;
    static int bottom;
    
    public static int North(){
    	int temp = 0;
    	temp = top; top = south; south = bottom; bottom = north; north = temp;
        return top;
    }
    
    public static int East(){
    	int temp = 0;
    	temp = top; top = west; west = bottom; bottom = east; east = temp;
    	return top;
    }
    
    public static int West(){
    	int temp = 0;
    	temp = top; top = east; east = bottom; bottom = west; west = temp;
    	return top;
    }
    
    public static int South(){
    	int temp = 0;
    	temp = top; top = north; north = bottom; bottom = south; south = temp;
    	return top;
    }
    
    public static int Right(){
    	int temp = 0;
    	temp = north; north = west; west = south; south = east; east = temp;
    	return top;
    }
    
    public static int Left(){
    	int temp = 0;
    	temp = north; north = east; east = south; south = west;  west = temp;
    	return top;
    }
    
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while(true){
			int n = in.nextInt();
			
			if(n == 0) break;
			
			top = 1;
			north = 5;
			south = 2;
			east = 3;
			west = 4;
			bottom = 6;
			int ans = top;
			
			for(int i=0; i <= n; i++){
				String c = in.nextLine();
				if(c.equals("North")){
					ans = ans + North();
				}else if(c.equals("East")){
					ans = ans + East();
				}else if(c.equals("West")){
					ans = ans + West();
				}else if(c.equals("South")){
					ans = ans + South();
				}else if(c.equals("Right")){
					ans = ans + Right();
				}else if(c.equals("Left")){
					ans = ans + Left();
				}
			}
			System.out.println(ans);
		}
	}
}