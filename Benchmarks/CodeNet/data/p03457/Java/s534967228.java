import java.util.*;
 
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
	List<Integer> listT = new ArrayList<Integer>();
	List<Integer> listX = new ArrayList<Integer>();
	List<Integer> listY = new ArrayList<Integer>();
    listT.add(0);
    listX.add(0);
    listY.add(0);
	while(sc.hasNext()){
		listT.add(sc.nextInt());
		listX.add(sc.nextInt());
		listY.add(sc.nextInt());
	}
	//経過時間
	int dt = listT.get(1);
	//移動距離
	int dist = listX.get(1) + listY.get(1);
	
	if(dist > dt){System.out.println("No");}
	
	for(int i = 0; i <= n-1; i++){
		
		dt = listT.get(i+1) - listT.get(i);
		dist = Math.abs(listX.get(i+1) - listX.get(i)) 
			+ Math.abs(listY.get(i+1) - listY.get(i));
		if((dt%2!=0 && dist%2==0) || (dt%2==0 && dist%2!=0)){
			System.out.println("No");
			break;
		}
		if((i==n-1 && dt%2==0 && dist%2==0) || (i ==n-1&& dt%2!=0 && dist%2!=0)){
			System.out.println("Yes");
		}
	}
  }
}