import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
        int m=sc.nextInt();
        long o=0;
        ArrayList<Long> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            long k=sc.nextLong();
        	a.add(k);
            for(int j=i;j>0;j--){ 
            	long c=a.get(j-1);
                if(c<k){
                	a.set(j-1,k);
                    a.set(j,c);
                }else{
                	break;
                }
            }
        }
        //heapRecursive(a,0);
        if(n==1){
        	o=(long)(a.get(0)/Math.pow(2,m));
        }else{
            for(int i=0;i<m;i++){
                long d=a.get(0)/2;
                a.set(0,d);
                long c=a.get(1);
                int count=1; 
                while(d<c){
                    a.set(count-1,c);
                    a.set(count,d);
                    if(count+1>=n)break;
                    c=a.get(count+1);
                    count++;
                }
                //heapRecursive(a,0);
                //System.out.println(d);
            }
            for(int i=0;i<n;i++){
                o+=a.get(i);
            }
        }
		System.out.println(o);
    }  

	public static void heapRecursive(ArrayList<Long> arrayList,int i){   //N[i] とN[2i+1],N[2i+2]の比較
        //再帰的なヒープの作成
        int size=arrayList.size();
        if (i>=0){
            long N0,N1,N2,Nm;
            int maxI=i;  //i,2i+1,2i+2
            N0=arrayList.get(i);
            Nm=N0;
            if(2*i+1<size){ //左側の枝が存在する
                heapRecursive(arrayList, 2*i+1);
                N1=arrayList.get(2*i+1);
                if(Nm>N1){
                    maxI=2*i+1;
                    Nm=N1;
                }
            }
            if(2*i+2<size){ //右側の枝が存在する
                heapRecursive(arrayList, 2*i+2);
                N2=arrayList.get(2*i+2);
                if(Nm>N2){
                    maxI=2*i+2;
                    Nm=N2;
                }
            }
            if(maxI!=i){
                arrayList.set(i,Nm);    //データの入れ替え iに最大値
                arrayList.set(maxI,N0);  //2i+1 or 2i+2にiの値
                heapRecursive(arrayList, maxI);
            }

        }
    }
}