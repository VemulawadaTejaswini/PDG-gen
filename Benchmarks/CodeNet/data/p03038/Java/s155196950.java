import java.util.*;
import java.util.Arrays;
import java.util.Comparator;
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
public class Main {    
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();        
		int a = sc.nextInt();
        int [] s = new int [n];
        for(int i=0;i<n;i++){s[i]=sc.nextInt();}
        Arrays.sort(s);
		int [] in = new int [a];
        int [] in2 = new int [a];
        long ans = 0;       
        Data [] d = new Data [a];
         for(int i=0;i<a;i++){int B = sc.nextInt();
                              int C = sc.nextInt();
                              d[i] = new Data(B,C);                            
                             }
        Arrays.sort(d, new Comparator<Data>() {
            public int compare(Data d1, Data d2) {
                return d1.getB() - d2.getB();
            }
        }); 
        int b = a-1;
        int count = 0;
        for(int i=0;i<n;i++){if(b>=0 && d[b].getB()>s[i]){s[i]=d[b].getB();
                                                          count++;                                                 
                                                          if(count==d[b].getA())
                                                          {b--;count=0;}
                                                         }else{break;}
                  }        
		for(int i=0;i<n;i++){ans+=s[i];}
        System.out.println(ans);
	}
}