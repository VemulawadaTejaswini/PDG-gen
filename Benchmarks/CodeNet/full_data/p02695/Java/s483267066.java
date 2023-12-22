

public class Main {
    static int n,m,q;
    static ABCD[] array;
    static int max;
    static int[] A;
    public static void main(String[] args) {
       
        FastScanner fs = new FastScanner();
        n = fs.nextInt();
        m = fs.nextInt();
        q = fs.nextInt();
        array = new ABCD[q];
        max = 0;
        A = new int[n];
        for(int i=0;i<q;i++){
            array[i] = new ABCD(fs.nextInt(),fs.nextInt(),fs.nextInt(),fs.nextInt());
        }

        combination(0,0,1);
        
        System.out.println(max);


    }
    public static void combination(int pos ,int count,int val){
        if(count == n){
            int sum = 0;
            for(int i=0;i<q;i++){
                if(A[array[i].b-1]-A[array[i].a-1] == array[i].c){
                    sum+=array[i].d;
                }
            }
            max = Math.max(sum,max);
        }else{
            for(int i=val;i<=m;i++){
                A[pos] = i;
                combination(pos+1,count+1,i);
            }
        }
    }
}

class ABCD{
    int a,b,c,d;
    ABCD(int a,int b,int c,int d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
}
