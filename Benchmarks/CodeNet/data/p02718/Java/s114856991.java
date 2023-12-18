import java.*;
import java.util.*;
 
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		int productsNum = Integer.parseInt(sc.next());
      	int chooseNum = Integer.parseInt(sc.next());
      	int totalVote=0;
      	List<Integer>productList=new ArrayList<>();
      	for(int i=0;i<productsNum;i++){
        	int vote = Integer.parseInt(sc.next());
          	totalVote+=vote;
          	productList.add(vote);
        }
      	Collections.sort(productList,  Collections.reverseOrder());
      	double limit=totalVote/(4*chooseNum);
      	for(int i=0;i<chooseNum;i++){
        	if(productList.get(i)<=limit){
            	System.out.println("No");
              	System.exit(0);
            }
        }
      	System.out.println("Yes");
    }
}