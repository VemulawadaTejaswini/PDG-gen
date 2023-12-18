import java.util.*

public class Main {
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		
		int N1 = sc.nextInt();
        int N2 = sc.nextInt();
        int N3 = sc.nextInt();
        int N4 = sc.nextInt();
        ArrayList<int> a = new ArrayList<int>();
        a.add(1);
        a.add(7);
        a.add(9);
        a.add(4);
        
        if(a.indexOf(N1) != -1){
        	a.remove(a.indexOf(N1));
            if(a.indexOf(N2) != -1){
        		a.remove(a.indexOf(N2));
                if(a.indexOf(N3) != -1){
        			a.remove(a.indexOf(N3));
                    if(a.indexOf(N4) != -1){
        				System.out.println("YES");
                    }
                }
            }
        }else{
        	System.out.println("NO");        
        }
     } 
}  
        
        