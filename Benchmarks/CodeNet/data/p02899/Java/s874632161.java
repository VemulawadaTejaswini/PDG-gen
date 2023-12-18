import java.util.*;
public class Main{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
      	ArrayList<Integer> intList = new ArrayList<Integer>();
      	for(int i = 0; i<N;i++){
        	intList.add(sc.nextInt());
        }
      	ArrayList<Integer> getAt = new ArrayList<Integer>();
        for(int j = 0;j<N;j++){
        	getAt.add(getMax(intList,j+1));
        }
      	for(int result:getAt)
      		System.out.print(result+" ");
        
    }
  	public static int getMax(ArrayList<Integer> list,int N){
    	int count = 1;
      	for(int i :list){
            if(i==N){break;}
            count++;
        }
      	return count;
    }

}