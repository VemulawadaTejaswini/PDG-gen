import java.util.*;
 
public class Main{
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();  
      
      List<Integer> split = new ArrayList<>();
        for (int i = 0; i < n; i++) {
	        int buf = sc.nextInt();
	        split.add(buf);
        }
        
        int tmp = 0;
        int tmp2 = 0;
        int size = split.size();
 
        for(int i = 0; i < size ; i++ ){
            tmp = split.get(i);
            
            for(int j = 0; j < size ; j++){
                tmp2 = split.get(j);
                
                if(tmp2 == tmp && j!= i){
                  split.remove(j);
                  size -= 1;
                }
            }
        }
    System.out.println(size);
  }
}