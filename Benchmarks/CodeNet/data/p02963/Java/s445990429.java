import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=Long.parseLong(sc.next());
        long n2=n;
        int ans=0;
        ArrayList<Integer>bunkai=new ArrayList<>();
        for(int i=2;i<n;i++){
            while(n%i==0){
                n/=i;
                bunkai.add(i);
            }
        }
        if(n!=1)bunkai.add((int)n);
        if(bunkai.size()>20){
            n=n2;
            for(int i=0;i*i<n;i++){
                if(((long)Math.sqrt(n+i*i))*((long)Math.sqrt(n+i*i))==n+i*i){
                    ans=i;
                    break;
                }
            }
            long po=(long)Math.sqrt(n+ans*ans);
            System.out.println("0 0 "+po+" "+(ans)+" "+(ans)+" "+po);
        }
        else{
            int size=bunkai.size();
            String[] all=allBit(size);
            long ansa[]=new long[all.length];
            for(int i=0;i<all.length;i++){
                long a=1;
                for(int j=0;j<size;j++){
                    if(all[i].charAt(j)=='1'){
                        a*=bunkai.get(j);
                    }
                }
                ansa[i]=Math.abs(a-(n2/a));
            }
            Arrays.sort(ansa);
            long k=ansa[0];
            long ll=(-k+(long)(Math.sqrt(k*k+4*n2)))/2;
            System.out.println("0 0 "+0+" "+ll+" "+(ll+k)+" "+0);
        }
    }
    public static String[] allBit(int n) {
		String[] a = new String[1 << n];
		for (int i = 0; i < (1 << n); i++) {
			a[i] = "";
			for (int j = 0; j < n; j++) {
				a[i] += ((1 & i >> j) == 1) ? 1 : 0;
			}

		}
		return a;

	}
    
}
