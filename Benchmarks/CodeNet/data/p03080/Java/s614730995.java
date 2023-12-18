import java.util.*;

public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        String si[] = new String[n];
        int red = 0;
        int blue = 0;
        for(int i = 0; i < n; i++){
        	si[i] = s.substring(i, i + 1);
            if(si[i].equals("R")){
            	red++;
            }else if(si[i].equals("B")){
            	blue++;
            }
        }
        if(red > blue){
        	System.out.println("Yes");
        }else{
        	System.out.println("No");
        }
    }
}