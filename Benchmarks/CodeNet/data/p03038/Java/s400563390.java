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
        int [] s = new int [n];
        for(int i=0;i<n;i++){s[i]=sc.nextInt();}
        Arrays.sort(s);
		int a = sc.nextInt();
		int [] in = new int [a];
        int [] in2 = new int [a];
        long ans = 0;
        for(int i=0;i<a;i++){
                             in[i] = sc.nextInt();
                             in2[i] = sc.nextInt();
                            }
        Data [] d = new Data [a];
         for(int i=0;i<a;i++){d[i] = new Data(in[i],in2[i]);                            
                             }
        Arrays.sort(d, new Comparator<Data>() {
            public int compare(Data d1, Data d2) {
                return d1.getB() - d2.getB();
            }
        }); 
        int b = 0;
        int c = a-1;
        int count = 0;
        while(b<n){if(c>=0 && d[c].getB()>in[b]){in[b]=d[c].getB();
                                                 count++;
                                                 b++;
                                                 if(count==d[c].getA()){c--;count=0;}
                                                }else{break;}
                  }        
		for(int i=0;i<n;i++){ans+=s[i];}
        System.out.println(ans);
	}
}
