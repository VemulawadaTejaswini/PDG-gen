import java.util.*;

public class Main{
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    int result = 0;
    
    ArrayList<Integer> bndList = new ArrayList<Integer>();
    
    for(int i = 0; i<=n; i++){
      	if(i != 0){
        int bnd = sc.nextInt();
      	result = result + bnd;
        System.out.println(result);
        }
      	bndList.add(result);
    }
    
    for (int i=0; i<bndList.size(); ++i){
      System.out.println(bndList.get(i));
    }
  }
 }