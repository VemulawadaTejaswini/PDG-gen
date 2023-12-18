import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

  		int n = sc.nextInt()-1;
      	int cs[] = new int[n];
      	int ss[] = new int[n];
      	int fs[] = new int[n];
      	int time;
      
      	int istack;
      	boolean judge = true;
      	
      	for(int i = 0;i < n; i++){
        	cs[i] = sc.nextInt();
          	ss[i] = sc.nextInt();
          	fs[i] = sc.nextInt();
        }
      	
        for(int i = 0; i < n; i++){
         time=0;
         for(int j = i; j < n;j++){
           if(time <= ss[j]) time = ss[j];
           else{
           	 istack = time - ss[j];
             if(istack % fs[j] != 0) time = ss[j] + (istack/fs[j]+ 1)*fs[j];
           }
           time+=cs[j];
         }
         System.out.println(time);
        }
      System.out.println(0);
	}
}
