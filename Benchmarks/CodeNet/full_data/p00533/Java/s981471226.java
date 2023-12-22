import java.util.*;
public class Main {
    static void print(int w, int h,int[][] ans){
    	for(int i=0;i<h;i++){
			for(int j=0;j<w;j++){
				if(j==w-1) System.out.println(ans[j][i]);
				else {
					System.out.print(ans[j][i]);
					System.out.print(" ");
				}
			}
		}
    }
    void doIt() {
        Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int[][] an = new int[w+1][h+1];
		int count=-1;
		char c ='c';
		int[][] ans = new int[w+1][h+1];
		for(int i=0;i<h;i++){
			char[] s = sc.next().toCharArray();
			for(int j=0;j<w;j++){
				if(c==s[j]){
					count=0;
					an[j][i]=0;
				}
				else{
					if(count>=0){
						count+=1;
						an[j][i]=count;
					}
					else an[j][i]=count;
				}
			}
			count=-1;
		}
		print(w, h,ans);
    }
     
    public static void main(String[] args){
        new Main() . doIt();
    }
 
}