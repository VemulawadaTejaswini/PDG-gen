import java.util.*;
import java.util.Arrays;
import java.util.Comparator;
public class Main {    
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();        
		int m = sc.nextInt();
        int [] A = new int [n];
        for(int i=0;i<n;i++){A[i] = sc.nextInt();}
        Arrays.sort(s);               
        Data [] d = new Data [a];
        for(int i=0;i<m;i++){int B = sc.nextInt();
                             int C = sc.nextInt();
                             d[i] = new Data(B,C);                            
                            }
        Arrays.sort(d, new Comparator<Data>() {
            public int compare(Data d1, Data d2) {
                return d1.getB() - d2.getB();
            }
        }); 
        int point = m-1;
        int count = 0;
        for(int i=0;i<n;i++){if(point>=0 && d[b].getB()>A[i]){A[i]=d[point].getB();
                                                              count++;                                                 
                                                              if(count==d[point].getA())
                                                             {point--;count=0;}
                                                             }else{break;}
                            }
        long ans = 0;
		for(int i=0;i<n;i++){ans+=s[i];}
        System.out.println(ans);
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