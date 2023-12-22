import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	
		int n = sc.nextInt();
      	int m = sc.nextInt();
      	int ngs[] = new int[n];
      	List gpList = new ArrayList<Integer>();
      	int grp = 1;
      	int cg = 0;
      	int ng = 0;
      	int a,b;
        long lstack;
      
      	Arrays.fill(ngs,0);
      	for(int i = 0; i < m;i++){
          a = sc.nextInt()-1;
          b = sc.nextInt()-1;
          if(ngs[a] == 0 && ngs[b] == 0){
            ngs[a] = grp;
            ngs[b] = grp;
            grp++;
          } else if(ngs[a] == 0){
            ngs[a] = ngs[b];
          } else if(ngs[b] == 0){
            ngs[b] = ngs[a];
          } else if(ngs[a] != ngs[b]){
            for(int j = 0; j < n;j++){
              if(ngs[j] == a) ngs[j] = b;
              cg++;
            }
          }
        }
      
      	for(int i = 0;i < n;i++){
          if(ngs[i] == 0)ng++;
        }
          
      	System.out.println(grp + ng - cg -2);
	}
}