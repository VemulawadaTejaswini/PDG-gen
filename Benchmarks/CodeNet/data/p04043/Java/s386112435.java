import java.util.*;
public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}
 
 
	public void run() {
		Scanner sc = new Scanner(System.in);
		int A[] =new int[3];
        
        
        
        for(int i=0;i<3;i++){
            A[i]=sc.nextInt();
            
        }
		int five=0;
		int seven=0;
		
		for(int i=0;i<3;i++){
		    if(A[i]==5){
		        five++;
		    }else if(A[i]==7){
		        seven++;
		    }
		}
		
		if(five==2 && seven==1){
		    System.out.println("YES");
		}else{
		    System.out.println("NO");
		}
		
	}
		
}
