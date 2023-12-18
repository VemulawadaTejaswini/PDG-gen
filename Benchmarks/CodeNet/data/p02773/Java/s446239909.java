import java.util.*;
public class Main {
	public static void main(String[] args){
      	int Access = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();		
      	String a;
      	HashMap<String, Integer> map = new HashMap<>();
      	for(int i= 1; i<=n;i++)
        {
         	a = sc.next();          	
          	if (map.containsKey(a))
            {
              map.put(a,map.get(a)+1);
            }
          	else
            {
              map.put(a,1);
            }
        }	
      	int maxValueInMap=(Collections.max(map.values()));
        for (Map.Entry<String, Integer> entry : map.entrySet()){    
            if (entry.getValue()==maxValueInMap) {
                System.out.println(entry.getKey());
            }
        }      	
	}
}