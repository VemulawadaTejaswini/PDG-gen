import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  	Scanner inp=new Scanner(System.in);
  	inp.next();
  	int a[]=new int[inp.nextInt()];
  	int b=0;
  	
  	for(int i=0;i<a.length;i++){
  		a[i]=inp.nextInt();
  	}
  	a=sort(a);
  	for(int i=1;i<a.length;i++){
  		b+=a[i];
  	}
  	b=a[0]-b-1;
  	if(b<0)b=0;
  	System.out.println(b);
  }
  public static int[] sort(int[] k){
        int b[]=new int[k.length];
        for(int i=0;i<b.length;i++){
            b[i]=k[i];
        }
        for(int i=0;i<k.length;i++){
            int P=0;
            
            for(int j=0;j<k.length;j++){
                if(k[i]>k[j]){//大きい順は演算子逆
                    P++;
                }
            }
            while(b[P]==k[i])P++;
            b[P]=k[i];
        }
        
        for(int i=0;i<k.length;i++){
            k[i]=b[i];
        }
        return k;
  }
}
