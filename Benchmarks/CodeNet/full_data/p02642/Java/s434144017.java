import java.util.*;
import java.math.*;
public class Main {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int d = sc.nextInt();
			arr.add(d);
            }
        Collections.sort(arr,Collections.reverseOrder());	
    
		int count = 0;		
		for(int i=0; i < arr.size(); i++) 
		{
          //indentical		
          for(int j=i; j < arr.size(); j++)
          {
            
            if( (arr.get(j)) >= (arr.get(i)) )
               {
              
              if((i!=j) && (arr.get(i) == arr.get(j)))
				 {count++; System.out.println("B");break;}  
              if(i>0)
				 {if(arr.get(i-1) == arr.get(j))
					 {
						 count++;System.out.println("A");break;
					}
              }
				       
			 
               
               }
             else  if ((arr.get(i)!=arr.get(j)) && (arr.get(i) % arr.get(j) ==0))
			{count++;System.out.println("C");break;}
            
		  }

        }
		System.out.println(arr.size()-count);
    }
}