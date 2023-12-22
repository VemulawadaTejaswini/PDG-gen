import java.util.*;
import java.util.Arrays;
import java.util.Comparator;
public class Main {    
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();        
		int m = sc.nextInt();
        String s = "Yes";
        int [] ans = new int [n-1];              
        Data [] d = new Data [m];
        for(int i=0;i<m;i++){int B = sc.nextInt();
                             int C = sc.nextInt();
                             if(B<C){d[i] = new Data(B,C);}
                             else{d[i] = new Data(C,B);}
                            }
        Arrays.sort(d, new Comparator<Data>() {
            public int compare(Data d1, Data d2) {
                return d1.getA() - d2.getA();
            }
        }); 
        int count = 0;
 		for(int i=0;i<m;i++){if(d[i].getA()==1){ans[d[i].getB()-2]=1;count++;}
                            }
        int count2 = count;
        while(count<n-1){
          for(int i=count2;i<m;i++){if(ans[d[i].getA()-2]==0&&ans[d[i].getB()-2]!=0)
          {ans[d[i].getA()-2]=d[i].getB();count++;if(count==n-1){break;}}
                       if(ans[d[i].getB()-2]==0&&ans[d[i].getA()-2]!=0){ans[d[i].getB()-2]=d[i].getA();count++;if(count==n-1){break;}}   }}
        System.out.println(s);
        if(s.equals("Yes")){for(int i=0;i<n-1;i++){System.out.println(ans[i]);}}
	}
}
class Data{
    private int a;
    private int b;
    public Data(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int getA() {
        return a;
    }
    public int getB() {
        return b;
    }
}
