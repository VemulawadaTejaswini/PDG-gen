import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
      	int m = sc.nextInt();
      	int ast,bst;
      	int cnts[] = new int[n];
      	long nums[] = new long[m];
      	List nList = new ArrayList<Long>();
      	int cnt = 0;
      
      	Arrays.fill(cnts,0);
      	for(int i = 0;i < m;i++){
          ast = sc.nextInt() - 1;
          bst = sc.nextInt() - 1;
          if(ast > bst) nums[i] = ast * 1000000L + bst;
          else nums[i] = bst * 1000000L + ast;
          if(!nList.contains(nums[i])){
            nList.add(nums[i]);
          cnts[ast]++;
          cnts[bst]++;
          if(cnts[ast] > cnt) cnt = cnts[ast];
          else if(cnts[bst] > cnt) cnt = cnts[bst];
          }
        }
      	Arrays.sort(nums);
      	//for(int i = 0;i < m;i++){
      
      	System.out.println(cnt+1);
	}
}
