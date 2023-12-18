import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        Long a = sc.nextLong();
      	List<Long> list = new ArrayList<>();
      	Long Index=1L;
      	Long Break=0L;
      	for(Long i=0L;i<a;i++)
        {          
          	list.add (sc.nextLong());
        }
      	for(Long n : list)
        {
          	if(n!=Index)
            {
              Break=Break+1;
            }
          	else
            {
              Index=Index+1;
            }
        }
      	if(Break==a)
          System.out.println("-1");
      	else
          System.out.println(Break);
    
	}
}